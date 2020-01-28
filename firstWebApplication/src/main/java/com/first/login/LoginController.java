package com.first.login;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.first.login.LoginService;

@Controller
@SessionAttributes("username")
public class LoginController {
	@Autowired
	LoginService service;
	@RequestMapping(value="/login",method =RequestMethod.GET)
	public String sayHello() {
		
		return "Login";
	}
	
	@RequestMapping(value="/login",method =RequestMethod.POST)
	public String sayHi(@RequestParam String username, @RequestParam String password, ModelMap model) {
	if(!service.isUserValid(username, password)) {
		model.put("errorMessage", "Invalid Credentials");
		return "Login";
	}
		model.put("username", username);
		model.put("password", password);
		return "Welcome";
	}
}
