package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.BooksInfo;
import com.capgemini.librarymanagementsystem.dto.UserInfo;

public interface UserDao {
	
	boolean registerUser(UserInfo u);
	UserInfo auth(String uname,String upassword);
	boolean requestBook(int bid,String author,int bookEdition);
	BooksInfo searchBook(int bid);
	BooksInfo borrow(int bid);
	
	
	

}
