package com.scalvo.profiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Profile(Profiles.DEVELOPMENT)
public class WebSecurityConfigDev extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/")
				.permitAll()
				.and()
			.authorizeRequests()
				.antMatchers("/h2-console/**)")
				.permitAll();
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}
}
