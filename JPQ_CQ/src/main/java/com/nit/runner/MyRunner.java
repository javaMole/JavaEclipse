package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Tourist;
import com.nit.repo.IRepository;
@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private IRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		List<Tourist> savedTouristList=repo.saveAll(
				List.of(new Tourist("Abhishek", "USA", "India"),
				new Tourist("Raju", "USA", "Thailand"),
			new Tourist("Kumar", "Germany", "India"),
				new Tourist("Alex", "USA", "Turkey"),
			new Tourist("Cristopher", "USA", "India"),
			new Tourist("Jenifer", "UK", "Kashmir"),
			new Tourist("Lawrence", "USA", "Bhutan")));
		
		System.out.println(savedTouristList.size() + " is added in the db  with id values : "+savedTouristList.stream().map(Tourist::getId).toList());
	}

}
