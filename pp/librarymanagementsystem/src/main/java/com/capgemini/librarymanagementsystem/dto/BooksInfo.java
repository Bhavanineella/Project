package com.capgemini.librarymanagementsystem.dto;

import java.io.Serializable;

public class BooksInfo implements Serializable{
	
	private int bid;
	private int bookEdition;
	private String author;
	private String subject;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getBookedition() {
		return bookEdition;
	}
	public void setBookedition(int bookedition) {
		this.bookEdition = bookedition;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	

}
