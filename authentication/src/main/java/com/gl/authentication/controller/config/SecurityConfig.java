package com.gl.authentication.controller.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter
{
	
	@Override
	protected void configure(HttpSecurity http)throws Exception
	{
		http.csrf().disable()
		.authorizeRequests().anyRequest().authenticated().and().httpBasic();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception
	{
		/*//with password encoder
		 * PasswordEncoder
		 * encoder=PasswordEncoderFactories.createDelegatingPasswordEncoder();
		 * 
		 * auth.inMemoryAuthentication().withUser("ratna")
		 * .password(encoder.encode("ratna")).roles("USER");
		 */
		
		// without password encoder
		auth.inMemoryAuthentication().withUser("ratna")
		  .password("{noop}ratna").roles("USER");
		
		
	}
	
}
