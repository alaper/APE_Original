package com.acmeTelecom;

public class Runner {

	public static void main(String[] args)
	{
		System.out.println("Running....");
		BillingSystem billingSystem = new BillingSystem();
		
		billingSystem.callInitiated("447722113434", "447766511332");
		try{
			sleepSeconds(20);
			} catch(InterruptedException IE){};
		
		
		billingSystem.callCompleted("447722113434", "447766511332");
		billingSystem.callInitiated("447722113434", "447711111111");
		try{
			sleepSeconds(30);
			} catch(InterruptedException IE){};
		
		
		billingSystem.callCompleted("447722113434", "447711111111");
		billingSystem.callInitiated("447777765432", "447711111111");
		
		try{
			sleepSeconds(60);
			} catch(InterruptedException IE){};
		
		
		billingSystem.callCompleted("447777765432", "447711111111");
		billingSystem.createCustomerBills();
		}
		
	private static void sleepSeconds(int n) throws InterruptedException {
		Thread.sleep(n * 1000);
	}
	
}
