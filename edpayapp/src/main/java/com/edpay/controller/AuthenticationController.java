package com.edpay.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public boolean login(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("auth:"+auth);
		if(auth !=null)
			return true;
		else
			return false;
		
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public boolean logout(HttpServletRequest request, HttpServletResponse response){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
			return true;
		}
		System.out.println("User is not logged in");
		return false;
	}
	

}
