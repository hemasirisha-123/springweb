package com.myapp.springweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class MainAppController {
	
	
	 @Autowired
	 private UserService userService;
	
	@GetMapping("/login")
	 
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public String loginvalid(@RequestParam("uname")String name,@RequestParam("pass")String pass) {
		
		boolean result= userService.loginValid(name, pass);
		
		if(result) {
			return " login success";
		}
		return "login failure";
	}
	
	@GetMapping("/register")
	 
	public String register() {
		return "register";
	}
	
	@PostMapping("/register")
	@ResponseBody
	public String userregister(@RequestParam("uname")String name,@RequestParam("pass")String pass,@RequestParam("email")String email,@RequestParam("city")String city) {
		User usr= new User(name,pass, email, city);
		
		ArrayList<User> list= new ArrayList<>();
		
		list.add(usr);
		userService.addUser(name, list);
		return "user is registered";
	}
	@GetMapping("/getname/{uname}")
	@ResponseBody
	public String getUser(@PathVariable("uname")String uname ) {
		boolean found=userService.getUser(uname);
		if(found) {
			return "user found";
		}
		return "user not found";
	}

}
