package com.pe.l1.java11.flightRecorder;

import java.util.ArrayList;
import java.util.List;

public class FlightRecorder {
//	public static void main(String[] args) 
	public static void intro()
	{
	    List<Object> items = new ArrayList<>(1);
	    try {
	        while (true){
	            items.add(new Object());
	        }
	    } catch (OutOfMemoryError e){
	    	e.printStackTrace();
	    }
	    assert items.size() > 0;
	    try {
	        Thread.sleep(1000000);
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	}
}