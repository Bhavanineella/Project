package com.capgemini.librarymanagementsystem.dto;

import java.io.Serializable;

public class AdminInfo implements Serializable{
	
	private int adid;
	private String adname;
	private String adpassword;
	
	
	public int getAdid() {
		return adid;
	}
	public void setAdid(int adid) {
		this.adid = adid;
	}
	public String getAdname() {
		return adname;
	}
	public void setAdname(String adname) {
		this.adname = adname;
	}
	public String getAdpassword() {
		return adpassword;
	}
	public void setAdpassword(String adpassword) {
		this.adpassword = adpassword;
	}
	
	

}
