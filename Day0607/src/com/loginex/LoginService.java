package com.loginex;

import java.util.*;
public class LoginService {
	
	private HashMap<String, String> loginDatas;
	private HashMap<String, UserVO> userDatas;
	
	public LoginService() {
		
		loginDatas = new HashMap<String,String>();
		userDatas = new HashMap<String,UserVO>();
		
		loginDatas.put("java", "java");
		userDatas.put("java", new UserVO("java","java","��������","ȫ�浿",20));
		
		
		
		
	}
	public UserVO login(String id, String password) {
		UserVO user = null;
		if(loginDatas.containsKey(id)) {
			if(loginDatas.get(id).equals(password)) {
				user = userDatas.get(id);
			}
		}
		return user;
	}

}
