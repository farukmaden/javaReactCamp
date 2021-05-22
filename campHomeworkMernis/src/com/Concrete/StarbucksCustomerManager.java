package com.Concrete;

import com.Abstracts.BaseCustomerManager;
import com.Abstracts.CustomerCheckService;
import com.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {

	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	 
	@Override
	public void save (Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Ge�erli Bir Ki�i De�il");
		}
	}
}
