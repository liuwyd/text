package com;

public class Users {		//存用户信息的类
    private String userName ;		//用户名
    private String password ;		//密码
    public Users(String userName, String password) {
        this.userName = userName ;
        this.password = password ;
    }
    public void setUserName(String newName) {
        userName = newName ;
    }
    public void setPassWord(String newPass) {
        password = newPass ;
    }
    public String getUserName() {
        return userName ;
    }
    public String getPassword() {
        return password ;
    }
}

