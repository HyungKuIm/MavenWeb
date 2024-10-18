package com.oraclejava.commentstore.service;

import java.util.List;

import com.oraclejava.model.Phone;

public interface PhoneService {
	List<Phone> listPhone();
	int addPhone(Phone phone);
}
