package com.Abstracts;

import com.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void save(Customer customer ) {
		System.out.println("veri taban�na kaydedildi : " + customer.FirstName );
		
	}

}
