package com.capgemini.librarymanagementsystem.dto;

import java.io.Serializable;

public class UserInfo implements Serializable{
	
	private int uid;
	private String uname;
	private String upassword;
	private String ubranch;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUbranch() {
		return ubranch;
	}
	public void setUbranch(String ubranch) {
		this.ubranch=ubranch;
	}
	
	

}
