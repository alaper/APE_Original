package com.acmeTelecom;

import com.acmetelecom.customer.Tariff;
import com.acmetelecom.customer.Customer;

public class TestTariffDatabase implements iTariffDatabase{

	public Tariff getTariff(Customer cust)
	{
		switch(cust.getPricePlan())
		{
		case "Business": 	return Tariff.Business;
							
		case "Leisure": 	return Tariff.Leisure;
							
		case "Standard":	return Tariff.Standard;
		
		default:	return Tariff.Business;
		}
		
	}
	
	
}
