package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.db.CommonDB;
import com.capgemini.librarymanagementsystem.dto.AdminInfo;
import com.capgemini.librarymanagementsystem.dto.BooksInfo;
import com.capgemini.librarymanagementsystem.exception.CommonException;

public class AdminDaoImplementation implements AdminDao{

	public AdminInfo auth(String adname, String adpassword) {
		for(AdminInfo info:CommonDB.ADMIN) {
			if(info.getAdname().equals(adname) && info.getAdpassword().equals(adpassword)) {
				return info;
			}
		}
		throw new CommonException("Invalid Credentials");
	}

	
	public boolean addBook(BooksInfo bi) {
		for(BooksInfo a1:CommonDB.BOOKS) {
			if(a1.getBid()==bi.getBid()) {
				return false;
			}
		}
			CommonDB.BOOKS.add(bi);
		return true;
	}

	public boolean removeBook(int bid) {
		BooksInfo b1=new BooksInfo();
		if(b1.getBid()==bid) {
				return true;
			}
		throw new CommonException("Book not removed");
	}

	public boolean issueBook(String subject) {
		for(BooksInfo bi:CommonDB.BOOKS) {
			if(bi.getSubject()==subject){
				return true;
			}
		}
		
		return false;
	}

	public boolean registerAdmin(AdminInfo a) {
		for(AdminInfo admin:CommonDB.ADMIN) {
			if(admin.getAdname().equals(a.getAdname())&& admin.getAdpassword().equals(a.getAdpassword())) {
				return true;
			}
		}
		 CommonDB.ADMIN.add(a);
		 return false;
		
	}
	
	public BooksInfo searchBook(int bid) {
		for(BooksInfo bf:CommonDB.BOOKS) {
			if(bf.getBid()==bid) {
				return bf;
			}
		}
		throw new CommonException("Book not found");
	}

}
