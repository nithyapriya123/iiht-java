package com.cms.coursemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("krishna")
	.password("{noop}krishna").roles("USER");  
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET,"/home").hasRole("USER")
		.and()
		.csrf().disable()
		.formLogin().disable();
		
	}

}
