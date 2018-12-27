package com.edpay.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edpay.model.Institutes;
import com.edpay.response.InstituteOutbound;


public interface InstituteService {
	
	public List<Institutes> getAllInstitute();
	
	
}
