package com.acmeTelecom;

import java.util.ArrayList;
import java.util.List;

public class CallLog {

	private List<CallEvent> callLog = new ArrayList<CallEvent>();
	
	public void initiateCall(String caller, String callee, long time)
	{
		callLog.add(new CallStart(caller, callee, time));
	}
	
	public void initiateCall(String caller, String callee)
	{
		callLog.add(new CallStart(caller, callee));
	}
	
	 public void callCompleted(String caller, String callee) {
	        callLog.add(new CallEnd(caller, callee));}
	 
	 public void callCompleted(String caller, String callee, long time)
	 {
		 callLog.add(new CallEnd(caller, callee, time));
	 }
	 
	 public List<CallEvent> getCallLog()
	 {
		 return callLog;
	 }
	        
	 public void clear()
	 {
		 callLog.clear();
	 }
}
