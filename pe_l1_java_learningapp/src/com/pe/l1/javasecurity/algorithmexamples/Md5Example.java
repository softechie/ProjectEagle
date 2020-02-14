package com.pe.l1.javasecurity.algorithmexamples;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/* **********Simple java program to calculate MD5 hash using MD5 algorithm**************

 To calculate cryptographic hashing value in Java, MessageDigest Class is used, under the package java.security.
 
 MessagDigest Class provides following cryptographic hash function to find hash value of a text :
 MD2,MD5,SHA-1,SHA-224,SHA-256,SHA-384,SHA-512.
 
These algorithms are initialized in static method called getInstance(). 
After selecting the algorithm the message digest value is calculated and the results are returned as a byte array. 
BigInteger class is used, to convert the resultant byte array into its signum representation. 
This representation is then converted into a hexadecimal format to get the expected MessageDigest.
 
The text to be encoded is called " message " and generated hash value is called "message digest" or simply "digest".

MD5 ALGORITHM:

MD5 produces 128 bit hash value.After applying MD5, generated hash is typically a 32-digit hexadecimal number.
MD5 algorithm, which operates in a 128-bit state, and the result will be a 128-bit hash value.

These hashes are not always unique, and it means that for two different inputs we could have equal hashes. 
When this happens it’s called a “collision”.

MD5 is not collision resistant which means that different passwords can eventually result in the same hash.
It is susceptible to brute-force and dictionary attacks.


The basic operation of MD5 is shown below in following steps for generating hash:
1. A string consisting of 1 followed by zeroes, and

2. 64-bit integer that indicates the length of original message, to make the length of the composite message multiples of 512 bits.

• The message digest calculation begins with a digest value initialized to a constant.

• This value is combined with the first 512 bits of the message to produce a new value for the digest.

• The new value is than combined with the next 512 bits of the message using the same transformation.

• This process is repeated on each 512-bit block till the final value of digest is obtained from the last block of the message.

• The digest is 128-bit long for any message length.


The MD5 digest creates a cryptographic hash of the data supplied to it. 
This is irreversible. 
Base64 is an encoding mechanism to convert data (which might contain unprintable binary data)
 into a string that is guaranteed to contain only printable characters. 
*/
/*
  	This below piece of code is used to convert byte into sign magnitude and then into hexadecimal value.
  	
				 BigInteger no = new BigInteger(1, messageDigest); 
				   // Convert message digest into hex value 
				          String hashtext = no.toString(16);  
				           while (hashtext.length() < 32) 
				           { 
				              hashtext = "0" + hashtext; //padding 0's are added
				           } 
				                  OR
       Use a custom byte to hex converter to get the hashed value in hexadecimal as shown below
       
				private static String bytesToHex(byte[] hash) { 
				    StringBuffer hexString = new StringBuffer();
				    for (int i = 0; i < hash.length; i++)
				     {
				        String hex = Integer.toHexString(0xff & hash[i]);
				         if(hex.length() == 1) hexString.append('0'); 
				           hexString.append(hex);
				    }
				   return hexString.toString();
				}
				

				
 */
	public class Md5Example {	
		
		
		public static String generateMD5(String message)  {
		    return hashString(message, "MD5");
		}
		
		private static String hashString(String message, String algorithm)
     {
		 
		    try {
		        MessageDigest digest = MessageDigest.getInstance(algorithm);
		        byte[] hashedBytes = digest.digest(message.getBytes("UTF-8"));
		 
		        return convertByteArrayToHexString(hashedBytes);
		    } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
		        ex.printStackTrace();
		    }
			return null;
	}
		
		private static String convertByteArrayToHexString(byte[] arrayBytes) {
		    StringBuffer stringBuffer = new StringBuffer();
		    for (int i = 0; i < arrayBytes.length; i++) {
		    	
		        stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
		                .substring(1));
		    }
		    return stringBuffer.toString();
		}
		
		 
		public static void main(String[] args) throws UnsupportedEncodingException 
	    {
			
			try {
	            String inputString = "message";
	            System.out.println("Input String: " + inputString);
	 
	            String md5Hash = Md5Example.generateMD5(inputString);
	            System.out.println("MD5 Hash: " + md5Hash);
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	    	       
	        
	    }
	


