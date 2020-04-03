package com.capgemini.librarymanagementsystem.factory;

import com.capgemini.librarymanagementsystem.dao.AdminDao;
import com.capgemini.librarymanagementsystem.dao.AdminDaoImplementation;
import com.capgemini.librarymanagementsystem.dao.UserDao;
import com.capgemini.librarymanagementsystem.dao.UserDaoImplementation;
import com.capgemini.librarymanagementsystem.service.AdminService;
import com.capgemini.librarymanagementsystem.service.AdminServiceImplementation;
import com.capgemini.librarymanagementsystem.service.UserService;
import com.capgemini.librarymanagementsystem.service.UserServiceImplementation;

public class CommonFactory {
	
	public static AdminDao getAdminDao() {
		return new AdminDaoImplementation();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplementation();
	}
	public static UserDao getUserDao() {
		return new UserDaoImplementation();
	}
	public static UserService getUserService() {
		return new UserServiceImplementation();
	}

}
