package com.edpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.edpay.model.Institutes;
import com.edpay.response.InstituteOutbound;
import com.edpay.service.InstituteService;

@RestController
public class InstituteController {
	
	@Autowired (required=true)
	InstituteService is;
	
	@GetMapping("/getAllInstitute")
	public List<Institutes> getAllInstitute() {
		return is.getAllInstitute();
	}
	

}
