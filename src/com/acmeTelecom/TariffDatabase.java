package com.acmeTelecom;

import com.acmetelecom.customer.CentralTariffDatabase;
import com.acmetelecom.customer.Customer;
import com.acmetelecom.customer.Tariff;

public class TariffDatabase implements iTariffDatabase{

	public Tariff getTariff(Customer customer)
	{
		return CentralTariffDatabase.getInstance().tarriffFor(customer);

	}
	
	
}
