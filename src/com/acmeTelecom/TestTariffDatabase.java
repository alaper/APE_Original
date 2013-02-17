package com.acmeTelecom;

import com.acmetelecom.customer.Tariff;
import com.acmetelecom.customer.Customer;

public class TestTariffDatabase implements iTariffDatabase{

	public Tariff getTariff(Customer cust)
	{
		return Tariff.Business;
	}
	
	
}
