package com.spring.core.demo;

//App.java
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	 public static void main(String[] args) {
	     try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
	         
	    	 // Retrieve the Book bean from the context
	         Book book = context.getBean(Book.class);
	
	         // Use the Book object
	         System.out.println(book);
	     }
	 }
}
