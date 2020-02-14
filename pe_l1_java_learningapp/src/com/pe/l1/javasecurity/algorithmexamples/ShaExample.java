package com.pe.l1.javasecurity.algorithmexamples;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* **********Simple java program to calculate SHA-1 hash using SHA algorithm**************

To calculate cryptographic hashing value in Java, MessageDigest Class is used, under the package java.security.

MessagDigest Class provides following cryptographic hash function to find hash value of a text :
MD2,MD5,SHA-1,SHA-224,SHA-256,SHA-384,SHA-512.

These algorithms are initialized in static method called getInstance(). 
After selecting the algorithm the message digest value is calculated and the results are returned as a byte array. 
BigInteger class is used, to convert the resultant byte array into its signum representation. 
This representation is then converted into a hexadecimal format to get the expected MessageDigest.

The text to be encoded is called " message " and generated hash value is called "message digest" or simply "digest".

SHA-1 Algorithm:

SHA-1 works by feeding a message as a bit string of length less than 2^{64} bits,
and producing a 160-bit hash value known as a message digest.

Here are the main methods of MessageDigest class:

getInstance("SHA1") - Returns a message digest object represents a specific implementation of SHA1 algorithm from the default provider, Sun.
getProvider() - Returns the provider name of the current object.
update(bytes) - Updates the input message by appending a byte array at the end.
digest() - Performs SHA1 algorithm on the current input message and returns the message digest as a byte array.
This method also resets the input message to an empty byte string.
 

*/
public class ShaExample {

	 public static String calculateHash(String input1) 
	    { 
	
        try { 
        	  
            // Static getInstance method is called with hashing SHA-1 
            MessageDigest md = MessageDigest.getInstance("SHA-1"); 
           
            md.update(input1.getBytes());
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
          //  Completes the hash computation by performing final operations
         //  such as padding.
            byte[] messageDigest = md.digest(); 
           
            // Convert byte array into sign magnitude representation 
            BigInteger num = new BigInteger(1, messageDigest); 
  
         // Convert a string to a sequence of 16-word blocks.
    		// Append padding bits , as described in the SHA1 standard
            // Convert message digest into hex value 
            String hashtext = num.toString(16);
            
            // Add preceding 0s to make it 32 bit 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 

           return hashtext;
          // return messageDigest.toString();
        }  
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
        
	  }
        public static void main(String[] args) 
        { 
        	  System.out.println("Generated HashCode is: "); 
        	  String input = "this is demo";
        	 
        	 System.out.println("\n" + input + " : " + calculateHash(input)); 
       }
}
