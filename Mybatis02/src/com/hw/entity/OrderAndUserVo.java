package com.hw.entity;

public class OrderAndUserVo extends Orders{
	//添加user对应属性
	private int userid;
	private String userName;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
