package com.acmeTelecom;

import java.util.Calendar;
import java.util.Date;

public class DaytimePeakPeriod {

		public boolean offPeak(Date time)
		{
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(time);
			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			return hour < 7 || hour >= 19;
		}
	
}
