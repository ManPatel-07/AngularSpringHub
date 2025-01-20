package org.mm.config;

import org.mm.filters.JwtAuthFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityFilterChain 
{
	
	@Autowired
	private JwtAuthFilter jwtAuthFilter;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity
				.authorizeHttpRequests(auth -> auth
						.requestMatchers("/secondUser/test", "/auth/**").permitAll()
//						.requestMatchers("/secondUser/testadmin").hasAnyRole("ADMIN")
						.anyRequest().authenticated())
				.csrf(custom -> custom.disable())
				.httpBasic(Customizer.withDefaults())
				.formLogin(Customizer.withDefaults())
				.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
		
		return httpSecurity.build();
	}
	
//	@Bean
//	UserDetailsService myInMemoryUserDetailService()
//	{
//		UserDetails normalUser = User
//							.withUsername("man")
//							.password(passwordEncoder().encode("7720"))
//							.roles("USER")
//							.build();
//		
//		UserDetails adminUser = User
//				.withUsername("admin")
//				.password(passwordEncoder().encode("admin123"))
//				.roles("ADMIN")
//				.build();
//		
//		return new InMemoryUserDetailsManager(normalUser, adminUser);
//	}
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception
	{
		return config.getAuthenticationManager();
	}

}
