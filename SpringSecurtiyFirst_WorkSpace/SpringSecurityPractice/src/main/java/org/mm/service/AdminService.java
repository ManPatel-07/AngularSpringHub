package org.mm.service;

import java.util.Optional;

import org.mm.entities.AdminEntity;
import org.mm.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService 
{
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public AdminEntity signUp(AdminEntity adminEntity)
	{
		Optional<AdminEntity> byEmailAdmin = adminRepo.findByEmail(adminEntity.getEmail());
		
		if(byEmailAdmin.isPresent())
		{
			throw new BadCredentialsException("This Email Admin already Preset ...");
		}
		
		adminEntity.setPassword(passwordEncoder.encode(adminEntity.getPassword()));
		
		return adminRepo.save(adminEntity);
	}
}
