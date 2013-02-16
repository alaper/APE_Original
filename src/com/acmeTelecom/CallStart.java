package com.acmeTelecom;

public class CallStart extends CallEvent {

	public CallStart(String callee, String caller)
	{
		super(caller, callee, System.currentTimeMillis());
	}
	
}
