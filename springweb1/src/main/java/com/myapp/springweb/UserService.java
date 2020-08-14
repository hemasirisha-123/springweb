package com.myapp.springweb;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	HashMap<String, ArrayList<User>> hm= new HashMap<String, ArrayList<User>>();
	
	
	public boolean loginValid(String name,String pass) {

		if(name.equals("admin") && pass.equals("manager")) {
			return true;
		}
		return  false;
	}
	
	public void addUser(String name, ArrayList<User> usr) {
		
		
		
		hm.put(name, usr);
		userDao.saveAll(usr);
		System.out.println(hm);
		
	}
	public boolean getUser(String user) {
		if(hm.containsKey(user)) {
			System.out.println(hm.get(user));
			return true;
		}
		System.out.println("user not found");
		return false;
	}
	
	

}
