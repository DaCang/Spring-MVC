package com.songyl.webmvc.entity;

public class UserInfo {
    private String userName;
    private String userPSW;
    private String gender;

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getUserPSW() {
	return userPSW;
    }

    public void setUserPSW(String userPSW) {
	this.userPSW = userPSW;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    @Override
    public String toString() {
	return "UserInfo [ĞÕÃû:=" + userName + ", ÃÜÂë=" + userPSW + ", ĞÔ±ğ=" + gender + "]";
    }
}
