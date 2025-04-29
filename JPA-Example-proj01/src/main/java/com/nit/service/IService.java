package com.nit.service;

import java.util.List;

import com.nit.entity.Phone;

public interface IService {

	public List<String> addPhonesbatch(Iterable<Phone> phoneList)throws Exception;
	
	public List<Phone>  showAllPhones();
}
