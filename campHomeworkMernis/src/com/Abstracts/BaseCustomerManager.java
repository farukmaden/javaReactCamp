package com.Abstracts;

import com.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void save(Customer customer ) {
		System.out.println("veri tabanưna kaydedildi : " + customer.FirstName );
		
	}

}
