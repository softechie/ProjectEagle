package com.pe.l1.javasecurity.algorithmexamples;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.*;
/* **********Simple java program to calculate HmacSHA526 hash using MAC algorithm**************

The Java Mac (javax.crypto.Mac class can create a Message Authentication Code (MAC) from binary data. 
A MAC is a message digest which has been encrypted with a secret key.
 Only if you have the secret key you can verify the MAC.
 
 Mac class provides following algorithms to find hash value of a text :
HmacMD5,HmacSHA1,HmacSHA224,HmacSHA384,HmacSHA256,HmacSHA512.
Step1: Creating a Mac Instance:
 
 Creating a Mac instance is done using the getInstance() method. 
     Mac hmac = Mac.getInstance("HmacSHA256");
  This getInstance() method contains the name of the MAC algorithm to use.
  
Step2: Initializing the Mac:
 
 Once created, the Java Mac instance must be initialized. 
 You initialize the Mac instance by calling its init() method passing as parameter the secret key to be used by the Mac instance.

Step3: Calculating the MAC:

 Once the Java Mac instance is initialized you can start calculating MAC values with it. 
  To calculate a MAC value you call the Mac update() or doFinal() method. 
  
  
  HMACSHA256 working:
  
  HMACSHA256 is a type of keyed hash algorithm that is constructed from the SHA-256 hash function and used as HMAC. 
  The HMAC process mixes a secret key with the message data, hashes the result with the hash function, 
  mixes that hash value with the secret key again, and then applies the hash function a second time.
   The output hash is 256 bits in length.
*/


public class HmacExample {
		

		public static void main(String[] args) throws UnsupportedEncodingException, InvalidKeyException 
		
		{
     
		  try {
		    			    
		     String message = "Message";
		     
		     //Get an algorithm instance
		     Mac hmac = Mac.getInstance("HmacSHA256");
		   
		     Provider n= hmac.getProvider();
		  
		     int i= hmac.getMacLength();
		      System.out.println(i);
		
		     System.out.println("provider name of specified algorithm: "+n);
		    
		     //Random key Generation
		     KeyGenerator gen = KeyGenerator.getInstance("HmacSHA256");
		     
		    //create secret key
		     Key key = gen.generateKey();
		     
		     System.out.println(key);
		     
		    //assign secret key to algorithm
		     hmac.init(key);
		     
		  //   Generate Base64 encoded cipher string.
		     //You can use any other encoding format to get hash text in that encoding.
		     Base64.Encoder encoder = Base64.getEncoder();
		     
		     byte[] data=message.getBytes();
		     
		  // compute the hmac on input data bytes 
		     byte[] s=hmac.doFinal(data);
		     
		     String hash=encoder.encodeToString(s);
		     
		     System.out.println("encoded hash value: "+hash);
		  
		    //Trying to decode the obtained hash with the key
		 
		     Base64.Decoder decoder = Base64.getDecoder();
		
		     byte[] decode=decoder.decode(hash);
		   
		    
		     
		     hmac.init(key);
		     
		     byte[] decode1 = hmac.doFinal(decode);
		 
		     String decodedhash=new String(decode1);
		     
		     System.out.println("decoded hash value: "+decodedhash);		
		    
		    }
		   
		    catch (NoSuchAlgorithmException e){
		     e.printStackTrace();
		    }
		        
		   }
		
}


