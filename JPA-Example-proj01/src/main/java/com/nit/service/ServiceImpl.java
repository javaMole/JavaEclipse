package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nit.entity.Phone;
import com.nit.repository.IRepository;
@Service
public class ServiceImpl implements IService {
	@Autowired
	private IRepository repo;

	@Override
	public List<String> addPhonesbatch(Iterable<Phone> phoneList) throws Exception {
			
		List<Phone> savedPhoneList=repo.saveAll(phoneList);
		
		return savedPhoneList.stream().map(Phone::getId).map(i->i.toString()).toList();
	
	
	}

	@Override
	public List<Phone> showAllPhones() {
			return repo.findAll();
	}

	@Override
	public List<Phone> showAllPhonesByProperty(Example<Phone> example) {
		
		return repo.findAll(example);
	}

}
