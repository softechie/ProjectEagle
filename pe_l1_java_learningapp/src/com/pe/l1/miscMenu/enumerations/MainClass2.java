package com.pe.l1.miscMenu.enumerations;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainClass2 {

	public static void main(String[] args) {

		// IDIOM:Item-0171: Ensure values are mutually exclusive

		// Get enum constant by string -Lookup

		long start = System.currentTimeMillis();
		String url = "https://dev.domain/";

		Example2EnumLookup env = Example2EnumLookup.get(url);
		System.out.println("Example2 to demonstrate the use of lookup method using static blocks.");
		System.out.println(env);

		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Elapsed time using better approach is " + formatter.format((end - start) / 1000d) + " seconds");
//0.00200 seconds
	}

}
