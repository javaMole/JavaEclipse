package com.nit.service;

import java.util.List;

import org.springframework.data.domain.Example;

import com.nit.entity.Phone;

public interface IService {

	public List<String> addPhonesbatch(Iterable<Phone> phoneList)throws Exception;
	
	public List<Phone>  showAllPhones();
	
	public List<Phone> showAllPhonesByProperty(Example<Phone> example);

	public List<Phone> showAllPhonesByPropertyPriceOrder(boolean asc,String... properties);
	
	public Phone getPhoneByLazyLoading(Integer id);
	
}
