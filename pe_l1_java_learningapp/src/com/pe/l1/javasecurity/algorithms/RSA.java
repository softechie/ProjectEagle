package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class RSA {

	
	public static void intro()
	   {  
		 System.out.println("--------- Rivest-Shammir-Adleman algorithm(RSA)-----------\n"
            +"The Rivest-Shammir-Adleman algorithm, better known as RSA, is now the most widely used asymmetric cryptosystem on the web today.\n"
            + "RSA is based on the factorization of prime numbers.RSA is a slow algorithm and because of this, it is used to encrypt and decrypt the symmetric keys which in turn\n"
            + " encrypt and decrypt the communications. The symmetric keys perform the bulk of the work, while RSA creates a strong and secure channel.\n"
            + "The algorithm is based on the fact that the factors of large composite number is difficult: when the integers are prime, this method is known as Prime Factorization.\n"
            + "It is generator of public key and private key. Using public key we convert plain text to cipher text and private key is used for converting cipher text to plain text.\n"
            + "Public key is accessible by everyone whereas Private Key is kept secret. Public Key and Private Key are kept different.\n"
		);
			
	   	
		 	ExitModule.pressEnterToExit();
     }
}
