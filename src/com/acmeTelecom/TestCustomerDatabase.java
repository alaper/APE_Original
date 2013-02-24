package com.acmeTelecom;
import java.util.*;

import com.acmetelecom.customer.*;

public class TestCustomerDatabase implements iCustomerDatabase {

	private List<Customer> custList;
	
		
	public TestCustomerDatabase()
	{
		custList = new ArrayList<Customer>();
		
		
	}
	
	public void addCustomer(String name, String phoneNumber, String pricePlan)
	{
		custList.add(new Customer(name, phoneNumber, pricePlan));
	}
	
	public List<Customer> getCustomers()
	{
		return custList;
	}
	
}
