package com.capgemini.librarymanagementsystemusingjdbc.dto;

import java.io.Serializable;

public class BookInfo implements Serializable{
	
	private int bookid;
	private String author;
	private String publisher;
	private String sub;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	

}
