package com.demo.model;

public class MyUser {
	private String uname;
	private String pswd;
	private String role;
	public MyUser() {
		super();
	}
	public MyUser(String uname, String pswd, String role) {
		super();
		this.uname = uname;
		this.pswd = pswd;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", pswd=" + pswd + ", role=" + role + "]";
	}
	
	

}
