package com.oraclejava.commentstore.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.oraclejava.model.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Integer>{

	@Query("select p from Phone p order by p.price")
	List<Phone> findAll();
}
