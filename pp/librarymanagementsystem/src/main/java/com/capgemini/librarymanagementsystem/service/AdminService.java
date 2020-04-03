package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.dto.AdminInfo;
import com.capgemini.librarymanagementsystem.dto.BooksInfo;

public interface AdminService {
	
	AdminInfo auth(String adname,String adpassword);
	boolean addBook(BooksInfo b);
	boolean removeBook(int bid);
	boolean issueBook(String subject);
	boolean registerAdmin(AdminInfo a);
	BooksInfo searchBook(int bid);

}
