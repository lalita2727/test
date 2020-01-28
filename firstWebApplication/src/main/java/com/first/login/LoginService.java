package com.first.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
public boolean isUserValid(String username, String password) {
	if(username.equals("lalita")&& password.equals("kawale"))
	{
		return true;
	}

return false;
}
}
