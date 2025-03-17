package org.mm.service;

import org.mm.entities.UserTableEntity;
import org.mm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpUserService 
{
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public UserTableEntity signUp(UserTableEntity userTable)
	{	
		userTable.setPassword(passwordEncoder.encode(userTable.getPassword()));
		
		return userRepo.save(userTable);
	}
	
	public UserTableEntity getUserById(Long id)
	{
		UserTableEntity userEntity = userRepo.findById(id).orElseThrow();
		return userEntity;
	}
	
}
