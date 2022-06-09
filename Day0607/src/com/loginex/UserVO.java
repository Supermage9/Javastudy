package com.loginex;

public class UserVO {
	
	private String id;
	private String password;
	private String dong;
	private String name;
	private int age;
	
	
	public UserVO(String id,String password,String dong,String name,int age) {
		this.id = id;
		this.password = password;
		this.dong = dong;
		this.name = name;
		this.age = age;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDong() {
		return dong;
	}


	public void setDong(String dong) {
		this.dong = dong;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		
		return "아이디 : "+id+" 이름 : "+name+" 나이 : "+age+" 비밀번호 : "+password+" 동 : "+dong;
	}

}
