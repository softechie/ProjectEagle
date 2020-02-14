package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class HashFunctions {

	public static void intro()
	{
		
		 System.out.println("**********Hash functions/Algorithms********** \n "
		 		+ "Hash Function : A hash function is a mathematical function that converts a numerical input value into another\r\n" + 
		 		"compressed numerical value. The input to the hash function is of arbitrary length but output is\r\n" + 
		 		"always of fixed length.Values returned by a hash function are called message digest or simply hash values or hash code.\n"
		 		+"This do not use any key.Once hashing is performed and hash is generated,then"
		 		+ "we cannot decrypt it into original message.Hence it is called one-way function.\n"
		 		
		 		+ "Hash functions ensures integrity and are extremely useful and appear in almost all information security applications.\n"
		 		+ "\nFeatures of Hash functions:\n"
		 		+ "1.Fixed Length Output HashValue : Hash function coverts data of arbitrary length to a fixed length.\n"
		 		+ "This process is often referred to as hashing the data.\n"
		 		+ "2.Efficiency of Operation : Computationally hash functions are much faster than a symmetric encryption.\r\n" + 
		 		"\n Properties of Hash Functions :\n"
		 		+ "1. Pre-Image Resistance : This property means that it should be computationally hard to reverse a hash function.\n"
		 		+ "2. Second Pre-Image Resistance : This property means given an input and its hash, "
		 		+ "it should be hard to find a different input with the same hash.\r\n" 
		 		+ "3. Collision Resistance : This property means it should be hard to find two different inputs of any length that\r\n" + 
		 		"result in the same hash. This property is also referred to as collision free hash function.\n" 

		 		+ "\n some examples of hash functions are : MD , SHA, RIPEMD, Whirlpool.\n"
		 		+ "The most widely used hashing functions are MD5, SHA1 and SHA-256.\n"
		 		+ "\nWho uses hashing?\r\n" + 
		 		"\r" + 
		 		"The average user encounters hashing daily in the context of passwords.\n "
		 		+ "For example, when you create an email address and password, your email provider likely does not save your password.\n "
		 		+ "Rather, the provider runs the password through a hashing algorithm and saves the hash of your password.\n"
		 		+ " Every time you attempt to sign in to your email, the email provider hashes the password you enter and compares this hash to the hash it has saved.\n"
		 		+ "Only when the two hashes match are you authorized to access your email.\n"
		 		+ "\n Applications of Hash functions:\n"
		 		+ "1. Password storage: If user's password needs to be stored then the hash value of password is stored.\n"
		 		+ "such that an intruder can only see the hashes of passwords, even if he accessed the password.\r\n" + 
		 		" He can neither logon using hash nor can he derive the password from hash value since hash\r\n" + 
		 		"function possesses the property of pre-image resistance.\n"
		 		+ "2. Data integrity: \n"
		 		+ "\n The difference between hashing and encryption:\n"
		 		+ " The encryption can be reversed, or decrypted, using a specific key but once hash produced from a hash function cannot be reversed.\n"
		 		+ "\n  *****************Refer to package com.pe.l1.javasecurity.algorithmexamples and Md5Example class and ShaExample class to know the implementation************************\n"
		 		);
		 ExitModule.pressEnterToExit();
	}
}
