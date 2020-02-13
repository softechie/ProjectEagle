package com.pe.l1.misc;

public enum Enumerations {
	MONDAY (false), TUESDAY (false), WEDNESDAY (false), THURSDAY (false), 
	FRIDAY (false), SATURDAY (true), SUNDAY (true);
	
	private final boolean isWeekend;
	
	private Enumerations(final boolean isWeekend) {
		this.isWeekend = isWeekend;
	}
	
	public boolean isWeekend(Enumerations day){
		return day.isWeekend;
	}
}
