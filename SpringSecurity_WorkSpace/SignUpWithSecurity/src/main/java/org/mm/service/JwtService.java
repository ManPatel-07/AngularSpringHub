package org.mm.service;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Set;

import javax.crypto.SecretKey;

import org.mm.entities.UserTableEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService 
{
	@Value("${jwt.secretKey}")
	private String jwtSecretKey;
	
	private SecretKey getSecretkey()
	{
		return Keys.hmacShaKeyFor(jwtSecretKey.getBytes(StandardCharsets.UTF_8));
	}
	
	public String generateToken(UserTableEntity userEntity)
	{
		String token = Jwts.builder()
			.subject(userEntity.getId().toString())
			.claim("username", userEntity.getUsername())
			.claim("roles", Set.of("ADMIN", "USER"))
			.issuedAt(new Date())
			.expiration(new Date(System.currentTimeMillis() + 1000*60))
			.signWith(getSecretkey())
			.compact();
		
		return token;
	}
	
	public Long getUserIdFromToken(String token)
	{
		Claims claims = Jwts.parser()
			.verifyWith(getSecretkey())
			.build()
			.parseSignedClaims(token)
			.getPayload();
		
		return Long.valueOf(claims.getSubject());
	}
}
