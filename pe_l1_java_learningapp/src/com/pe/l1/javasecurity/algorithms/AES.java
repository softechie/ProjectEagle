package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class AES {

   public static void intro()
   {  
	 System.out.println("------Advanced Standard Encryption(AES)----\n");
	 System.out.println("The Advanced Encryption Standard (AES), also known by its original name Rijndael.\n"
	 		+ "AES is a subset of the Rijndael block cipher[3] developed by two Belgian cryptographers, Vincent Rijmen and Joan Daemen\n"
			 +"AES is is a symmetric block cipher chosen by the U.S. government to protect classified information and is implemented in software and hardware throughout the world to encrypt sensitive data.\n"
			+"It was started developing AES in 1997 by NIST(National Institute of Standards and Technology) when it was discovered that DES was vulnerable to brute-force attacks.\n"
	 		+ "It is a  replacement to DES started in January 1997 when NIST announced that it was looking for an Advanced Encryption Standard.\n"
			+"After many researches,it was selected as proposed algorithm by NIST in 2000.It became effective from 2002 then in 2003 NSA choosed AES to protect national security systems.\n"
	 		+"After it's successful use by US government it is widely used in private sector.\n"
	 		+ "\nThus concluded AES is more secure than its predecessors DES and 3DES  as the algorithm is stronger and uses longer key lengths(128 bit,192 bit,256 bit keys).\n"
	 		+ "It also enables faster encryption than DES and 3DES, making it ideal for software applications, firmware and hardware that require either low latency or high throughput, such as firewalls and routers.\n"
	 		+ "It is used in many protocols such as Secure Sockets Layer (SSL)/Transport Layer Security (TLS) and can be found in most modern applications and devices that need encryption functionality.\n");
	  System.out.println("------Working of AES algorithm----\n");
	  System.out.println("AES comprises three block ciphers: AES-128, AES-192 and AES-256.\n"
	  		+ "Each cipher encrypts and decrypts data with 128 bit block size using cryptographic keys of 128-bit, 192-bit and 256-bits, respectively. \n"
	  		+ "The key size used for an AES cipher specifies the number of transformation rounds that convert the input, called the plaintext, into the final output, called the ciphertext.\n"
	  		+ "The number of rounds are as follows:\r\n" + 
	  		"\r\n" + 
	  		"10 rounds for 128-bit keys.\r\n" + 
	  		"12 rounds for 192-bit keys.\r\n" + 
	  		"14 rounds for 256-bit keys.\r\n" + 
	  		"Each round consists of several processing steps, including one that depends on the encryption key itself.\n"
	  		+ "A set of reverse rounds are applied to transform ciphertext back into the original plaintext using the same encryption key. \n"
	  		+ "\n A round consists of several processing steps that include substitution, transposition and mixing of the input plaintext and transform it into the final output of ciphertext.\n"
	  		+ "AES is an iterated block cipher, meaning that the initial input block and cipher key undergoes multiple rounds of transformation before producing the output.\n "
	  		+ "Each intermediate cipher result is called a State.\n"
	  		+ "\n For generating cipher text AES undergoes following operations:\n\n"
	  		+ "1. KeyExpansion: round keys are derived from the cipher key using Rijndael's key schedule. AES requires a separate 128-bit round key block for each round plus one.\n\n"
	  		+ "2. AddRound Key transformation : AddRoundKey XORs a key that is the same length as the block, using an Expanded Key derived from the original Cipher Key\r\n" + 
	  		"\n3. Nr-1 Rounds comprising:\r\n\n" + 
	  		"SubBytes transformation : SubBytes takes the value of a word within a State and substitutes it with another value by a predefined S-box\r\n" + 
	  		"ShiftRows transformation : ShiftRows circularly shifts each row in the State by some number of predefined bytes\r\n" + 
	  		"MixColumns transformation : MixColumns takes the value of a 4-word column within the State and changes the four values using a predefined mathematical function\r\n" + 
	  		"AddRoundKey transformation : AddRoundKey XORs a key that is the same length as the block, using an Expanded Key derived from the original Cipher Key\r\n\n" + 
	  		"4. A final Round comprising:\r\n" + 
	  		"SubBytes transformation\r\n" + 
	  		"ShiftRows transformation\r\n" + 
	  		"AddRoundKey transformation");
	 	System.out.println("\n ------The key differences between AES vs. DES -------\r\n\n" + 
	 		"There is an important difference when comparing AES vs. DES encryption and decryption algorithms:\n"
	 		+ " AES is secure, while DES is not because AES allows you to choose a 128-bit, 192-bit or 256-bit key, making it exponentially stronger than the 56-bit key of DES.\n"
	 		+ "Main issue with DES was the short encryption key size. Shorter the key, it is easier to break it with brute force attack.\n"
	 		+ "AES is a more mathematically efficient and elegant cryptographic algorithm, but its main strength rests in its key length options.\n"
	 		
+ "\r\n *****************Refer to package com.pe.l1.javasecurity.algorithmexamples and AESExample class for code implementation **************"
	 		+ "");
	
	 	
	 	ExitModule.pressEnterToExit();
   }
}
