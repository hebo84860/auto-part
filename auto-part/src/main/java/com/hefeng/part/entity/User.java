package com.hefeng.part.entity;

import java.io.Serializable;

public class User implements Serializable {

	private String userName;
	private String passWord;
	private String nickName;
	private String realName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord
				+ ", nickName=" + nickName + ", realName=" + realName + "]";
	}
	
	
	
}
