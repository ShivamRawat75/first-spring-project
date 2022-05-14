package com.shivam.spring.springbootfirstwebapp.controller.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String name,String password)
	{
		return name.equalsIgnoreCase("in28minutes")&& password.equalsIgnoreCase("dummy");
	}

	}


