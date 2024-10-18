package com.oraclejava.commentstore.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oraclejava.model.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Integer>{

	List<Phone> findAll();
}
