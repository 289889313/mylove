package com.hw.entity;

import java.io.Serializable;

public class User implements Serializable{

	 private int userId;
	 private String loginName;
	 private String loginPwd;
	 private String userName;
	 private String userSex;
	 private int userType;
	 
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public User(int userId, String loginName, String loginPwd, String userName, String userSex, int userType) {
		super();
		this.userId = userId;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.userName = userName;
		this.userSex = userSex;
		this.userType = userType;
	}
	public User() {
		super();
	}
	public User(String loginName, String loginPwd) {
		super();
		this.loginName = loginName;
		this.loginPwd = loginPwd;
	}
	 
	 public User(String loginName, String loginPwd, String userName, String userSex, int userType) {
		super();
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.userName = userName;
		this.userSex = userSex;
		this.userType = userType;
	}
	public String toString(){
		 return this.getUserId()+"\t"+this.getLoginName()+"\t"
	 +this.getLoginPwd()+"\t"+this.getUserName()+"\t"+this.getUserSex()
	 +"\t"+this.getUserType();
	 }
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
}
