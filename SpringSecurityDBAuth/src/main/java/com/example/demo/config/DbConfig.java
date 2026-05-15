package com.example.demo.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.service.MyUserDetailsService;

import jakarta.servlet.Filter;

@Configuration
@EnableWebSecurity
public class DbConfig {
	
	@Autowired
	private MyUserDetailsService userDtlsSvc;
	
	@Autowired
	AppFilter filter;
	
	@Bean
	public PasswordEncoder pwdEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
	
	@Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider=
        		new DaoAuthenticationProvider(userDtlsSvc);
        //authenticationProvider.setUserDetailsService(userDtlsSvc);
        authenticationProvider.setPasswordEncoder(pwdEncoder());
        return authenticationProvider;
    }
	
//	@Bean
//    public AuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider authenticationProvider=
//        		new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userDtlsSvc);
//        authenticationProvider.setPasswordEncoder(pwdEncoder());
//        return authenticationProvider;
//    }
	
//	@Bean
//	public AuthenticationProvider authenticationProvider() {
//
//	    DaoAuthenticationProvider provider =
//	            new DaoAuthenticationProvider();
//
//	    provider.setUserDetailsService(userDtlsSvc);
//	    provider.setPasswordEncoder(pwdEncoder());
//
//	    return provider;
//	}
////	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        
		http
            .csrf(csrf -> csrf.disable())

            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/api/v1/register").permitAll()
                    .requestMatchers("/api/v1/login").permitAll()
                    .requestMatchers("/h2-console/**").permitAll()
                    .anyRequest().authenticated()
            )
            .sessionManagement(session ->
            	session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            )
            // Allow H2 Console Frames
            .headers(headers -> headers
                    .frameOptions(frame -> frame.disable())
            ) 
            .authenticationProvider(authenticationProvider())
            .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
