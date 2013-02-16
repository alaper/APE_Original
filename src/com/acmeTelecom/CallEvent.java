package com.acmeTelecom;

public abstract class CallEvent {

	private String caller;
	private String callee;
	private long time;
	
	public CallEvent(String caller, String callee, long timeStamp)
	{
		this.callee = callee;
		this.caller = caller;
		this.time = timeStamp;
		
	}
	
	public String getCaller()
	{
		return caller;
	}

	public String getCallee()
	{
		return callee;
	}
	
	public long time()
	{
		return time;
	}
}
