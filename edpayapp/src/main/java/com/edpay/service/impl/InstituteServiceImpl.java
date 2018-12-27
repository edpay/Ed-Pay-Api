package com.edpay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edpay.dao.IInstituteDAO;
import com.edpay.model.Institutes;
import com.edpay.service.InstituteService;

@Service
public class InstituteServiceImpl implements InstituteService{
	
	@Autowired
	IInstituteDAO idao;

	@Override
	public List<Institutes> getAllInstitute() {
		return idao.findAll();
	}

}
