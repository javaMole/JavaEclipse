package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Phone;
import com.nit.service.IService;
@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private IService service;
	@Override
	public void run(String... args) throws Exception {
		
		try {
System.out.println("Hello");
		
		List<String> phonesAdded=service.addPhonesbatch(List.of(
				new Phone("Iphone-6", "Apple", 30000.0),
				new Phone("Iphone-7", "Apple", 40000.0),
				new Phone("Iphone-8", "Apple", 50000.0),
				new Phone("Iphone-13", "Apple", 60000.0),
				new Phone("Moto-G2", "Motorola", 14000.0),
				new Phone("Moto-G1", "Motorola", 10000.0),
				new Phone("Samsung Galaxy s23", "Samasung", 55500.0),
				new Phone("Samsung J5", "Samsung", 30000.0),
				new Phone("Poco-F1", "Poco", 16000.0)
				)
				);
		
		System.out.println("  Total Phones added : "+phonesAdded.size()+ " they are -> "+phonesAdded);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
