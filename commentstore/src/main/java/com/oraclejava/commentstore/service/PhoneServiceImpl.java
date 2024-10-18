package com.oraclejava.commentstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraclejava.model.Phone;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;
	
	@Override
	public List<Phone> listPhone() {
		return phoneRepository.findAll();
	}

	@Override
	public int addPhone(Phone phone) {
		phoneRepository.save(phone);
		return phone.getId();
	}

}
