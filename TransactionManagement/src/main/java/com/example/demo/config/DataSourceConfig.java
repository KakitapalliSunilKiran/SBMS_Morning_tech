//package com.example.demo.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.transaction.PlatformTransactionManager;
//
//@Configuration
//public class DataSourceConfig {
//	
//	   @Bean
//	    public DataSource dataSource() {
//
//	        DriverManagerDataSource dataSource =
//	                new DriverManagerDataSource();
//
////	        dataSource.setDriverClassName("org.h2.Driver");
////	        dataSource.setUrl("jdbc:h2:mem:testdb");
////	        dataSource.setUsername("sa");
////	        dataSource.setPassword("");
////
////	        return dataSource;
//	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	        dataSource.setUrl(
//	            "jdbc:mysql://localhost:3306/testdb" +
//	            "?useSSL=false&serverTimezone=UTC"
//	        );
//	        dataSource.setUsername("root");
//	        dataSource.setPassword("root");
//
//	        return dataSource;
//	    }
//	
//	@Bean
//	public PlatformTransactionManager transactionManager(DataSource dataSource) {
//	    return new DataSourceTransactionManager(dataSource);
//	}
//
//
//}
