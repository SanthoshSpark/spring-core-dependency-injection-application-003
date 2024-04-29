package com.spring.core.demo;

//AppConfig.java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	 @Bean
	 public Author author() {
	     return new Author("John Doe");
	 }
	
	 @Bean
	 public Book book(Author author) {
	     return new Book("Spring in Action", author);
	 }
}
