package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.BooksInfo;
import com.capgemini.librarymanagementsystem.dto.UserInfo;

public interface UserService {


	boolean registerUser(UserInfo u);
	UserInfo auth(String uname,String password);
	boolean requestBook(int bid,String author,int bookEdition);
	BooksInfo searchBook(int borrowId);
	
}
