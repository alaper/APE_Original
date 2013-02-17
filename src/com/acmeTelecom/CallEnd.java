package com.acmeTelecom;

public class CallEnd extends CallEvent{

	public CallEnd(String caller, String callee, long time)
	{
		super(caller, callee, time);
	}
	
	public CallEnd(String caller, String callee)
	{
		super(caller, callee, System.currentTimeMillis());
	}
}
