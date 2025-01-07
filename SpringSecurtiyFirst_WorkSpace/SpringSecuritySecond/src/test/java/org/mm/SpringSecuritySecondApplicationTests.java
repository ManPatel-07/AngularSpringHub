package org.mm;

import org.junit.jupiter.api.Test;
import org.mm.entity.SecondUserEntity;
import org.mm.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSecuritySecondApplicationTests {
	
	@Autowired
	private JwtService jwtService;

	@Test
	void contextLoads() 
	{
		SecondUserEntity user = new SecondUserEntity(2l, "test@gmail.com", "123321");
		
		String token = jwtService.generateToken(user);
		
		System.out.println(token);
		
		Long id = jwtService.getUserIdFromToken(token);
		
		System.out.println(id);
		
	}

}
