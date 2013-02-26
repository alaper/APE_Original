package com.acmeTelecom;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.acmetelecom.customer.Customer;
import com.acmetelecom.customer.Tariff;


public class BillGenerator {

	private iCustomerDatabase custDbse;
	private iTariffDatabase trfDbse;
	private CallLog callLog;
	private Printer printer;
	
	public BillGenerator(iCustomerDatabase custDbse, iTariffDatabase trfDbse, CallLog callLog, Printer printer)
	{
		this.custDbse = custDbse;
		this.trfDbse = trfDbse;
		this.callLog = callLog;
		this.printer = printer;
	}
	
	public void createCustomerBills()
	{
		List<Customer> customers = custDbse.getCustomers();
        for (Customer customer : customers) {
         createBillFor(customer);
        }
        callLog.clear();
    }

    private void createBillFor(Customer customer) {
        
    	List<Call> calls = callLog.getCallLog(customer);
    	Tariff tariff = trfDbse.getTariff(customer);
    	Bill bill = new Bill();
    
        for (Call call : calls) {

            BigDecimal callCost = calculateCost(tariff, call);
            bill.addLine(call, callCost);
        }

        print(customer, bill);
    }
		
	public BigDecimal calculateCost(Tariff tariff,Call call)
	{
		BigDecimal cost;
		
		DaytimePeakPeriod peakPeriod = new DaytimePeakPeriod();
        if (peakPeriod.offPeak(call.startTime()) && peakPeriod.offPeak(call.endTime()) && call.durationSeconds() < 12 * 60 * 60) {
            cost = new BigDecimal(call.durationSeconds()).multiply(tariff.offPeakRate());
        } else {
            cost = new BigDecimal(call.durationSeconds()).multiply(tariff.peakRate());
        }

        cost = cost.setScale(0, RoundingMode.HALF_UP);
        return cost;

	}
	
	
	public void print(Customer customer, Bill bill)
	{
		
		printer.printHeading(customer.getFullName(), customer.getPhoneNumber(), customer.getPricePlan());
		for (Bill.LineItem call: bill.getLines())
		{
			printer.printItem(call.date(), call.callee(), call.durationMinutes(), MoneyFormatter.penceToPounds(call.cost()));
			}
		printer.printTotal(bill.getTotalAsString());
	}	

	

	
}
