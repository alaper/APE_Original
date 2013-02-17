package com.acmeTelecom;

import com.acmetelecom.customer.Customer;
import com.acmetelecom.customer.Tariff;

public interface iTariffDatabase {

	public Tariff getTariff(Customer customer);
	
}
