package com.acmeTelecom;

public class CallStart extends CallEvent {

	public CallStart(String caller, String callee)
	{
		super(caller, callee, System.currentTimeMillis());
	}
	
}
