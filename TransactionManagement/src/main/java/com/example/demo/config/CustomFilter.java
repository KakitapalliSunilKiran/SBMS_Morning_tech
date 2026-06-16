//package com.example.demo.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//
//import java.io.IOException;
//
//import org.springframework.stereotype.Component;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//
//@Component
//public class CustomFilter implements Filter
//{
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		System.out.println("I am in Filter layer");
//		chain.doFilter(request, response);
//		// TODO Auto-generated method stub
//		
//	}
//
//}
//
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.Customizer;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.core.userdetails.User;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.provisioning.InMemoryUserDetailsManager;
////import org.springframework.security.web.SecurityFilterChain;
////
////@Configuration
////public class CustomFilter {
////
////    @Bean
////    public InMemoryUserDetailsManager userDetailsService() {
////
////        UserDetails user1 = User.withUsername("sunil")
////                .password("{noop}1234")
////                .roles("USER")
////                .build();
////
////        UserDetails admin = User.withUsername("admin")
////                .password("{noop}admin123")
////                .roles("ADMIN")
////                .build();
////
////        return new InMemoryUserDetailsManager(user1, admin);
////    }
////
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////
////        http
////            .csrf(csrf -> csrf.disable())
////            .authorizeHttpRequests(auth -> auth
////                .requestMatchers("/admin/**").hasRole("ADMIN")
////                .requestMatchers("/user/**").hasRole("USER")
////                .anyRequest().authenticated()
////            )
////            .httpBasic(Customizer.withDefaults());   // or .formLogin()
////
////        return http.build();
////    }
////}
////
//////
//////@Configuration
//////@EnableWebSecurity
//////public class CustomFilter extends WebSecurityConfigurerAdapter {
//////
//////    @Override
//////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//////
//////        auth.inMemoryAuthentication()
//////            .withUser("sunil")
//////            .password("{noop}1234")
//////            .roles("USER")
//////            .and()
//////            .withUser("admin")
//////            .password("{noop}admin123")
//////            .roles("ADMIN");
//////    }
//////
//////    @Override
//////    protected void configure(HttpSecurity http) throws Exception {
//////
//////        http.csrf().disable()
//////            .authorizeRequests()
//////            .antMatchers("/admin/**").hasRole("ADMIN")
//////            .antMatchers("/user/**").hasRole("USER")
//////            .anyRequest().authenticated()
//////            .and()
//////            .formLogin();
//////    }
//////}
////
