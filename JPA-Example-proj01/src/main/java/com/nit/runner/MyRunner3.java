package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.nit.entity.Phone;
import com.nit.service.IService;
@Component
public class MyRunner3 implements CommandLineRunner {
	@Autowired
	private IService service;

	@Override
	public void run(String... args) throws Exception {
		
			/*try {
				
				Phone phone=new Phone();
				phone.setCompany("Samsung");
				System.out.println("Result : ");
				service.showAllPhonesByPropertyPriceOrder(true).forEach(System.out::println);;
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}*/
		
		try {
			
		String message=	service.getPhoneByLazyLoading(7).toString();
		System.out.println(message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
}
}