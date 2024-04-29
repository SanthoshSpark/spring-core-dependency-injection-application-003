package com.spring.core.demo;

//Book.java
public class Book {
	 private String title;
	 private Author author;
	
	 // Constructor with Author dependency (DI)
	 public Book(String title, Author author) {
	     this.title = title;
	     this.author = author;
	 }
	
	 @Override
	 public String toString() {
	     String out = "Title: " + title;
	     out = out + "\nAuthor: " + author.getName();
	     
	     return out;
	 }
}
