package com.application.log.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.application.log.customer.customer;

public interface customerRepo extends CrudRepository<customer,String>{

	List<customer> findByDate(String date);
	
	List<customer> findAll();
	
}
