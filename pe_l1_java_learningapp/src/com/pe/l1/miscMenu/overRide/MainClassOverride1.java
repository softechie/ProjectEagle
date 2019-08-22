package com.pe.l1.miscMenu.overRide;

import java.util.HashMap;
import java.util.Map;

public class MainClassOverride1 {

	public static void main(String[] args) {
		// creating two Objects with  
        // same state 
		System.out.println("Here is an Example for Overriding both equals(Object) and hashCode() method\n");
		System.out.println("When we call map.put(e1, \"Cloud Computing\");  it will hash to some bucket location and when we call map.put(e2, \"Artificial Intelligence\"); ,"
				+ "\nit  generates same hashcode value (same as e1) and replace first value by second value because "
				+ "\nwhile iterating over same bucket it found a k such that k.equals(e2) is true, means searching key already exist."
				+ "\nSo, it replaces old value of that key by new value.\n");
		System.out.println("----OUTPUT----");
		Example1 e1 = new Example1("abcd", 1); 
		Example1 e2 = new Example1("abcd", 1); 
          
        Map<Example1, String> map = new HashMap<Example1, String>(); 
        map.put(e1, "Cloud Computing\n"); 
        map.put(e2, "Artificial Intelligence\n"); 
          
        for(Example1 example : map.keySet()) 
        { 
            System.out.println(map.get(example).toString()); 
        } 
  
	}

}
