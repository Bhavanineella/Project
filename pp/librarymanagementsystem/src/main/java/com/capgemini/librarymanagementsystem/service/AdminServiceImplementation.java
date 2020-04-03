package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.dao.AdminDao;
import com.capgemini.librarymanagementsystem.dto.AdminInfo;
import com.capgemini.librarymanagementsystem.dto.BooksInfo;
import com.capgemini.librarymanagementsystem.factory.CommonFactory;

public class AdminServiceImplementation implements AdminService{
	
	private AdminDao dao=CommonFactory.getAdminDao();

	public AdminInfo auth(String adname, String adpassword) {
		return dao.auth(adname, adpassword);
	}

	public boolean addBook(BooksInfo b) {
		return dao.addBook(b);
	}

	public boolean removeBook(int bid) {
		return dao.removeBook(bid);
	}

	public boolean issueBook(String subject) {
		return dao.issueBook(subject);
	}

	public boolean registerAdmin(AdminInfo a) {
		return dao.registerAdmin(a);
	}

	public BooksInfo searchBook(int bid) {
		return dao.searchBook(bid);
	}

	
	
}
