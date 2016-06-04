package com.songyl.webmvc.entity;

import java.util.Arrays;

public class UserInfo {
    private String userName;
    private String userPSW;
    private String gender;
    private String[] skill;

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

    public String[] getSkill() {
	return skill;
    }

    public void setSkill(String[] skill) {
	this.skill = skill;
    }

    @Override
    public String toString() {
	return "UserInfo [姓名:=" + userName + ", 密码=" + userPSW + ", 性别=" + gender + ", 技能=" + Arrays.toString(skill)
		+ "]";
    }
}
