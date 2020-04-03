package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.dao.UserDao;
import com.capgemini.librarymanagementsystem.dto.BooksInfo;
import com.capgemini.librarymanagementsystem.dto.UserInfo;
import com.capgemini.librarymanagementsystem.factory.CommonFactory;

public class UserServiceImplementation implements UserService{

	private UserDao dao=CommonFactory.getUserDao();
			
	public boolean registerUser(UserInfo u) {
		return dao.registerUser(u);
	}

	public UserInfo auth(String uname, String upassword) {
		return dao.auth(uname, upassword);
	}

	public boolean requestBook(int bid,String author,int bookEdition) {
		return dao.requestBook(bid,author,bookEdition);
	}

	public BooksInfo searchBook(int borrowId) {
		return dao.searchBook(borrowId);
	}

}
