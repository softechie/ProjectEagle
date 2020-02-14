package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class DES {
	
	public static void intro()
	   {  
		 System.out.println("---------Data Encryption Standard (DES)-----------\n"
		 		+"The Data Encryption Standard or DES was, and probably still is, one of the more well-known algorithms of the modern cryptographic era.\n"
		 		+ " Today it is widely considered insecure. DES was developed in the 1970’s by IBM and was later submitted to the National Bureau of Standards (NBS) and National Security Agency (NSA).\n"
		 		+ "It is symmetric block cipher which uses 56-bit key length.DES has come up with 2 variants called double-DES and triple-DES\n"
		 		+ "DES and double-DES are no longer in use, but triple-DES with three keys is still a recommended algorithm in NIST SP 800-57.\n"
		 		+ "It is much slower to use than the AES algorithm and was found to attacked by brute-force attack due to its shorter key length of size 56bit.");
		 	
		
			
	   	
		 	ExitModule.pressEnterToExit();
  }

}
