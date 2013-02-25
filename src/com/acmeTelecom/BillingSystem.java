package com.acmeTelecom;

import com.acmetelecom.customer.CentralCustomerDatabase;
import com.acmetelecom.customer.CentralTariffDatabase;
import com.acmetelecom.customer.Customer;
import com.acmetelecom.customer.Tariff;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class BillingSystem {

	private CallLog callLog;
	private iCustomerDatabase custDbse;
    private iTariffDatabase tariffDbse;
	private Printer printer;
    
	public BillingSystem(CallLog callLog, iCustomerDatabase custDbse, iTariffDatabase tariffDbse, Printer printer)
	{
		this.callLog = callLog;
		this.custDbse = custDbse;
		this.tariffDbse = tariffDbse;
		this.printer = printer;
	}
	
	public BillingSystem()
	{
		this.callLog = new CallLog();
		this.custDbse = new CustomerDatabase();
		this.tariffDbse = new TariffDatabase();
		this.printer = HtmlPrinter.getInstance();
	}
		
	
	public void callInitiated(String caller, String callee)
	{
		callLog.initiateCall(caller, callee);
	}
	
	public void callCompleted(String caller, String callee)
	{
		callLog.callCompleted(caller, callee);
	}
	
	
    public void createCustomerBills() {
        
    new BillGenerator(custDbse, tariffDbse, callLog, printer).createCustomerBills();
    }
}		