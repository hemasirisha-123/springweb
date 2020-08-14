package com.myapp.springweb;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private  String uname;
	private String pass;
	private String email;
	private String city;
	 
	public User(String uname, String pass, String email, String city) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.email = email;
		this.city = city;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", pass=" + pass + ", email=" + email + ", city=" + city + "]";
	}

	
}
