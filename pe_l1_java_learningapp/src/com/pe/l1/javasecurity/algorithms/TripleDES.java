package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class TripleDES {

	public static void intro()
	   {  
		 System.out.println("------Triple Data Encryption Standard (3 DES)----\n"
		 		+ "Triple DES was designed to replace the original Data Encryption Standard (DES) algorithm, which hackers eventually learned to defeat with relative ease.\n"
		 		+ " At one time, Triple DES was the recommended standard and the most widely used symmetric algorithm in the industry.\r\n" + 
		 		"\r\n" + 
		 	"Triple DES was discovered with the purpose of enlarging the key space without any requirement to change DES algorithm.\n"
		 	+ "It has a key length of 168 bits three 56-bit DES keys but due to meet-in-middle-attack the effective security is only provided for only 112 bits. \n"
		 	+	"The total key length adds up to 168 bits.\n"
		 	+ "\n However Triple DES suffers from slow performance in software. Triple DES is well suited for hardware implementation.\n"
		 	+ "But presently Triple DES is largely replaced by AES (Advance Encryption Standard).\n");
		 
					
	   	
		 	ExitModule.pressEnterToExit();
        }
}