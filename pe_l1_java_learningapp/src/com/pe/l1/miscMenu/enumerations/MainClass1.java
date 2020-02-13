package com.pe.l1.miscMenu.enumerations;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.pe.l1.miscMenu.enumerations.Example1Enum.Environ;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = System.currentTimeMillis();
		System.out.println(
				"Example1 to demonstrate the working of enum.This program iterates and prints using .values()");
		for (Environ env : Environ.values())
			System.out.println(env);

		long end = System.currentTimeMillis();

		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Elapsed time using .values method is: " + formatter.format((end - start) / 1000d) + " seconds");
// 0.00300 seconds
	}

}
