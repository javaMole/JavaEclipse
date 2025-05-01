package com.nit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Customer;

@RestController
@RequestMapping("/test01")
public class MyRestController {
	
	@PostMapping("/request1")
	public ResponseEntity<Customer> endpoint1(@RequestBody Customer customer)
	{

		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/request2")
	public ResponseEntity<String> endpoint2(@RequestParam String name,
											  @RequestParam Integer cid,
											  @RequestParam String addr,
											  @RequestParam(required=false,defaultValue = "11.0") Double fee)
	{
		
		Customer customer=new Customer(name, cid, addr, fee);
		return new ResponseEntity<String>(customer.toString(),HttpStatus.OK);
	}
	@GetMapping({"/request3/{name}/{cid}/{addr}/{fee}","/request3/{name}/{cid}/{addr}"})
	public ResponseEntity<String> endpoint3(@PathVariable String name,
			@PathVariable("cid") Integer id,
			@PathVariable String addr,
			@PathVariable(required=false) Double fee)
	{
		
		Customer customer=new Customer(name, id, addr, fee);
		return new ResponseEntity<String>(customer.toString(),HttpStatus.OK);
	}
	
	

}
