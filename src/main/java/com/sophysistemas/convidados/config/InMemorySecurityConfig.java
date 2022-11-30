package com.sophysistemas.convidados.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)
			throws Exception {
			builder
			.inMemoryAuthentication()
			.withUser("admin").password("{noop}123456").roles("ADMIN")
			.and()
			.withUser("root").password("123").roles("USER");
	}
}
