package com.Concrete;

import com.Abstracts.CustomerCheckService;
import com.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}
