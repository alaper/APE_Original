package com.acmeTelecom;
import java.util.List;

import com.acmetelecom.customer.*;

public class CustomerDatabase implements iCustomerDatabase {

	
	
	
	public List<Customer> getCustomers()
	{
		return CentralCustomerDatabase.getInstance().getCustomers();
	}
	
	
	 
	
}
