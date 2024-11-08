package org.mm.service;

import org.mm.entities.UserTableEntity;
import org.mm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserTableService implements UserDetailsService
{
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		UserTableEntity byUsername = userRepo.findByUsername(username);
		
		if(byUsername == null)
		{
			throw new UsernameNotFoundException("UserName not Found !!! ");
		}
		
		return new UserTableEntity(byUsername.getId(), byUsername.getUsername(), byUsername.getPassword());
	}

}
