package org.mm.service;

import java.util.List;

import org.mm.entity.SecondUserEntity;
import org.mm.repository.SecondUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//@Service
public class SecondUserService implements UserDetailsService
{
	@Autowired
	private SecondUserRepository secondUserRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		return secondUserRepo.findByEmail(username).orElseThrow();
	}
	
	public List<SecondUserEntity> getAllUsers()
	{
		return secondUserRepo.findAll();
	}

}
