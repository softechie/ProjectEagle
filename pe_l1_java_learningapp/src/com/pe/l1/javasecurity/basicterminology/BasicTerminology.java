package com.pe.l1.javasecurity.basicterminology;

import com.pe.l1.utility.ExitModule;

public class BasicTerminology {

	 public static void intro()
	 {
		 System.out.println("-------Basic Terminology in Cryptography-------\n");
		 
		 
		 System.out.println("Plain text : Original data or message which is in readable format \n");
		
		 System.out.println("Cipher text :Ciphertext is the result of the encryption process. The encrypted plaintext appears as apparently random strings of characters, rendering them useless.\n"
				 +"A cipher is another way of referring to the encryption algorithm that transforms the plaintext, hence the term ciphertext.It is an encypted message which is in unreadable format. \n");
		
		 System.out.println("Enciphering/Encryption: process of converting plain text (readable format) to cipher text (unreadable format)\n");
		
		 System.out.println("Deciphering/ Decryption: process of converting cipher text (unreadable format) to plain text (readable format)\n");
		
		 System.out.println("Key: the secret material used for performing encryption\n");
		 
		 System.out.println("Key size : the amount of bits in the key\n");
		 
		 System.out.println("Block size : The block size is simply the amount of bits or bytes that can be transformed by the block cipher.\n");
		 
		 ExitModule.pressEnterToExit();
	 }
}


