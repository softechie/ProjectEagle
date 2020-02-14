package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class Elgamal {

	
	public static void intro()
	   {  
		 System.out.println("--------- Elgamal-----------\n"
     +"ElGamal encryption is an public-key cryptosystem which is based on the Diffie–Hellman key exchange."
     + "It was described by Taher Elgamal in 1985.It uses asymmetric key encryption for communicating between two parties and encrypting the message.\r\n" + 
     "This cryptosystem is based on the difficulty of finding discrete logarithm.\n"
     + "\n ElGamal encryption consists of three components: the key generator, the encryption algorithm, and the decryption algorithm.\n"
     + "The ElGamal cryptosystem is usually used as part of a hybrid cryptosystem where the message itself is encrypted using a symmetric cryptosystem and ElGamal is then used to encrypt only the symmetric key.\n"
     + "This is because asymmetric cryptosystems like ElGamal are usually slower than symmetric ones for the same level of security, so it is faster to encrypt the message\n"
     + "\nElGamal encryption is probabilistic, meaning that a single plaintext can be encrypted to many possible ciphertexts.\n"
     + "Encryption under ElGamal requires two exponentiations; however, these exponentiations are independent of the message and can be computed ahead of time.\n"
     + "Decryption requires one exponentiation and one computation of a group inverse which can however be easily combined into just one exponentiation.\n"
		);
			
	   	
		 	ExitModule.pressEnterToExit();
    }
}
