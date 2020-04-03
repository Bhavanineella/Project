package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.AdminInfo;
import com.capgemini.librarymanagementsystem.dto.BooksInfo;
import com.capgemini.librarymanagementsystem.dto.UserInfo;

public interface AdminDao {

	AdminInfo auth(String adname,String adpassword);
	boolean addBook(BooksInfo b);
	boolean removeBook(int bid);
	boolean issueBook(String subject);
	boolean registerAdmin(AdminInfo a);
	BooksInfo searchBook(int bid);
}
