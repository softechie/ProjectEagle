package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class SecureHashAlgorithm {

	public static void intro()
	{
		
		 System.out.println("**************Secure Hash Algorithm************* \n"
		 		+ "\nSecure Hash Algorithm is introduced since there were collisions in Message digest algorithms.\n"
		 		+ "Secure Hash Algorithms, also known as SHA, are a family of cryptographic functions designed to keep data secured."
		 		+ "It is very similar to MD5 except it generates more strong hashes\n"
		 		+ "It works by transforming the data using a hash function: an algorithm that consists of bitwise operations, modular additions, and compression functions.\n"
		 		+ "The hash function then produces a fixed-size string that looks nothing like the original.\n"
		 		+ "These algorithms are designed to be one-way functions, meaning that once they’re transformed into their respective hash values,\n"
		 		+ "it’s virtually impossible to transform them back into the original data.\n"
		 		+ "\nFamily of SHA comprise of four SHA algorithms; SHA-0, SHA-1, SHA-2, and SHA-3, each of which was successively designed\n"
		 		+ "with increasingly stronger encryption in response to hacker attacks."
		 		+ "SHA-2 is actually a family of hashes and comes in a variety of lengths, the most popular being 256-bit.\r\n"  
		 	    +"SHA-2 and SHA-256 refers to same thing.If you see “SHA-224,” ,“SHA-256,” “SHA-384,” or “SHA-512,” those are referring to the alternate bit-lengths of SHA-2.\r\n" 
		 	   
		 		+ "Though all these are from same SHA family, there are structurally different.\n"
		 		+ "SHA-0, for instance,is now obsolete due to the widely exposed vulnerabilities since it is not resistant to collison.\n"
		 	   +"\n-----------What is the difference between SHA1, SHA2, and SHA256?-------------\n"
		 	   + "\nSHA is an acronym for Secure Hash Algorithm, so while SHA2 is the successor to SHA1.\n"
		 	   + "\nSHA1 was developed by the US government and is closer in nature to MD5. "
		 	   + "It creates message digests, 160-bit (20-byte) hash values that are represented by 40-digit long hexadecimal strings.\n"
		 	   +"\nSHA2 was also developed by the US government, specifically the NSA, and is actually a family of algorithms\n"
		 	   + "six different hash functions that produce digest/hash values of varying lengths: 224, 256, 384 or 512.\n"
		 	   + "The variety of SHA-2 hashes can lead to a bit of confusion.If you see “SHA-2,” “SHA-256” or “SHA-256 bit,” those names are referring to the same thing.\n"
		 	   + "If you see “SHA-224,” “SHA-384,” or “SHA-512,” those are referring to the alternate bit-lengths of SHA-2.\n"
		 	   + "\nSHA-2 is mostly using in SSL/TLS certification generation using digital signatures.\n"
		 		+ "For example SHA-256 produces 2 power 256 combinations of hashes.\n"
		 		+ "Well, its a huge number so that it's difficult to produce same hash for different inputs.\n"
		 		+ "The larger the number of possible hashes, the smaller the chance that two values will create the same hash.\r\n" 
		 	
		 		+"\nSHA-3 is the latest secure hashing standard after SHA-2.\n"
		 		+ "Compared to SHA-2, SHA-3 provides a different approach to generate a unique one-way hash, and it can be much faster on some hardware implementations.\n"
		 		+ "Similar to SHA-256, SHA3-256 is the 256-bit fixed-length algorithm in SHA-3.\n"
		 		+ "NIST released SHA-3 in 2015, so there are not quite as many SHA-3 libraries as SHA-2 for the time being.\n"
		 		+ "Until JDK 9 that SHA-3 algorithms were not available in the built-in default providers.Inorder to use SHA3 library it requires JDK9+.\n"
		 		
		 		+ "\nJava has 4 implementations of SHA algorithm. They generate the following length hashes in comparison to MD5 (128-bit hash):\r\n" + 
		 		"\r\n" + 
		 		"SHA-1 (Simplest one & operates on 160 bits Hash)\r\n" + 
		 		"SHA-256 (Stronger than SHA-1 & operates on 256 bits Hash)\r\n" + 
		 		"SHA-384 (Stronger than SHA-256 & operates on 384 bits Hash)\r\n" + 
		 		"SHA-512 (Stronger than SHA-384 & operates on 512 bits Hash)\r\n" + 
		 		"\nA longer hash is more difficult to break. That’s the core idea.\n"
		 		
		 		+ "\n----------SHA implementation in JAVA----------\n"
		 		
				+ "\nTo calculate cryptographic hashing value in Java, MessageDigest Class is used, under the package java.security.\n"
				+ "\nMessagDigest Class provides following cryptographic hash function to find hash value of a text, they are:\r\n" + 
				
				"SHA-1\r\n" + 
				"SHA-224\r\n" + 
				"SHA-256\r\n" + 
				"SHA-384\r\n" + 
				"SHA-512\n"
				+ "These Algorithms are initialize in static method called getInstance().\n"
				+ "\ncalling getInstance() with algorithm MD5 in MessageDigest Class\r\n" + 
				"MessageDigest md = MessageDigest.getInstance(\"SHA-1\"); \r\n"
				+"\r\n" + 
				"MessageDigest md = MessageDigest.getInstance(\"SHA-256\");\n"
				
				+ "\n------------limitations in SHA family-------------\n"
				+ "In SHA-1,after many years of implementing it ,they were able to find  vulnerabilities on this algorithm.\r\n" + 
				"These finds collisions with different inputs which means 2 distinct inputs map to same digest.\n"
				+ "SHA-2: Due to the exposed vulnerabilities of SHA-1, cryptographers modified the algorithm to produce SHA-2,\n"
				+ "which consists of not one but two hash functions known as SHA-256 and SHA-512, using 32- and 64-bit words, respectively.\n"
				+ "There are additional versions of these hash functions, known as SHA-224, SHA-384, SHA-512/224, and SHA-512/256, which can be used for either part of the algorithm.\n"
				
				+ "\n----------Why increased various bit lengths in SHA-2?----------\n"
				+ "Most attacks penetrating SHA-1 are collision attacks, message produces the same hash value as the original message."
				+ " Generally, this takes time proportional to 2^{n/2} \r\n" + 
               	"  to complete, where n is the length of the message."
               	+ " This is the reason the message digests have increased in length from 160-bit digests in SHA-1 to 224- or 256-bit 512-bit digests in SHA-2.\n"
		 		
           + "\r\n *****************Refer to package com.pe.l1.javasecurity.algorithmexamples and ShaExample class to know the implementation on SHA-1 in java**************"
		 );
		 
		 
				 
		 ExitModule.pressEnterToExit();
	}
}
