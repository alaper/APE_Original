package com.acmeTelecom;
import java.util.*;

import com.acmetelecom.customer.*;

public class TestCustomerDatabase implements iCustomerDatabase {

	private List<Customer> custList;
	
		
	public TestCustomerDatabase()
	{
		custList = new ArrayList<Customer>();
		custList.add(new Customer("John","12345","Premium"));
		custList.add(new Customer("Alan", "54321", "Standard"));
	}
	
	
	
	public List<Customer> getCustomers()
	{
		return custList;
	}
	
}
