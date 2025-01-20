package org.mm.service;

import java.util.List;
import java.util.Optional;

import org.mm.entity.SecondUserEntity;
import org.mm.repository.SecondUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecondUserService implements UserDetailsService
{
	@Autowired
	private SecondUserRepository secondUserRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		return secondUserRepo.findByEmail(username).orElseThrow();
	}
	
	public List<SecondUserEntity> getAllUsers()
	{
		return secondUserRepo.findAll();
	}
	
	public SecondUserEntity signUp(SecondUserEntity userEntity)
	{
		Optional<SecondUserEntity> userByEmail = secondUserRepo.findByEmail(userEntity.getEmail());
		
		if(userByEmail.isPresent())
		{
			throw new BadCredentialsException("user already present ...");
		}
		
		userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
		
		return secondUserRepo.save(userEntity);
	}
	
	public SecondUserEntity getUserByUserId(Long id)
	{
		return secondUserRepo.findById(id).orElseThrow();
	}

}
