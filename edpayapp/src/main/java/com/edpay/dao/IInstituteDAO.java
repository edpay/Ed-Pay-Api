package com.edpay.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edpay.model.Institutes;

public interface IInstituteDAO extends JpaRepository<Institutes, Serializable>{
	
	public List<Institutes> findAll();

}
