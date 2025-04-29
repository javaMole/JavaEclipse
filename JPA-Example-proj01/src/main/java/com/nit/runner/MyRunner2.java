package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Phone;
import com.nit.service.IService;
@Component
public class MyRunner2 implements CommandLineRunner {
	@Autowired
	private IService service;

	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			
			List<Phone> phoneList=service.showAllPhones();
				phoneList.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
