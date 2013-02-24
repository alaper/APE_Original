package com.acmeTelecom;

import org.joda.time.*;

public class TestRunner {

	public static void main(String[] args)
	{
		CallLog cLog = new CallLog();
		
		DateTime testStart = new DateTime(2013,2,15,15,0,0,0);
		DateTime testEnd = new DateTime(2013,2,15,15,30,0,0);
		
		
		cLog.initiateCall("12345", "54321", testStart.getMillis());
		cLog.callCompleted("12345", "54321", testEnd.getMillis());
		
		TestCustomerDatabase tstCustDbse = new TestCustomerDatabase();
		
		tstCustDbse.addCustomer("Gandalf", "12345", "Business");
		tstCustDbse.addCustomer("Alan", "54321", "Standard");
		
		iCustomerDatabase testCustDbse = tstCustDbse;
				
		iTariffDatabase tstTrfDbse = new TestTariffDatabase();
		
		BillingSystem testBSystem = new BillingSystem(cLog, testCustDbse, tstTrfDbse);
		
		testBSystem.createCustomerBills();
	}
	
	
}
