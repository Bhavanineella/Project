package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.db.CommonDB;
import com.capgemini.librarymanagementsystem.dto.BooksInfo;
import com.capgemini.librarymanagementsystem.dto.UserInfo;
import com.capgemini.librarymanagementsystem.exception.CommonException;

public class UserDaoImplementation implements UserDao{

	public boolean registerUser(UserInfo u) {
		for(UserInfo in:CommonDB.USER) {
			if(in.getUid()==u.getUid()) {
				return false;
			}
		}
		CommonDB.USER.add(u);
		return true;
	}

	public UserInfo auth(String uname, String upassword) {
		for(UserInfo u1:CommonDB.USER) {
			if(u1.getUname().equals(uname)&& u1.getUpassword().equals(upassword)) {
				return u1;
			}
		}
		throw new CommonException("Invalid Credentials");
	}

	
	public boolean requestBook(int bid,String author,int bookEdition) {
		for(BooksInfo bi:CommonDB.BOOKS) {
			if(bi.getBid()==bid) {
				return true;
			}
		}
		throw new CommonException("No such book");
	}

	public BooksInfo searchBook(int bid) {
		for(BooksInfo bn:CommonDB.BOOKS) {
			if(bn.getBid()==bid) {
				
			}
		}
		return null;
	}
		
	public BooksInfo borrow(int bid) {
		BooksInfo bif=new BooksInfo();
		if(bif.getBid()==bid) {
			return bif;
		}
		throw new CommonException("Invalid id");
	}
	

	
}
