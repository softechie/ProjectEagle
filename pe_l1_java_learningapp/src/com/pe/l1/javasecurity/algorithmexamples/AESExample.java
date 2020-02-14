package com.pe.l1.javasecurity.algorithmexamples;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;



public class AESExample {
  
 
    public static String encrypt(String strToEncrypt, Key key) 
    {
        try
        {
           
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } 
        catch (Exception e) 
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
 
    public static String decrypt(String strToDecrypt, Key key) 
    {
        try
        {
           
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } 
        catch (Exception e) 
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
   
    public static void main(String[] args) throws NoSuchAlgorithmException 
    {
        
    	
        String originalString = "this is demo";
        
        try
        {
        	KeyGenerator gen=KeyGenerator.getInstance("AES");
            Key key=gen.generateKey();
        	
            //AES uses 128,192,256 bit keys.here using 128 bit key           
            // gen.init(128);     	
        	String encrypted=AESExample.encrypt(originalString,key);
        	System.out.println("encrypted string is "+encrypted);
        	
        	String decrypted=AESExample.decrypt(encrypted,key);
        	System.out.println("decrypted string is "+decrypted);
        }
        catch(Exception e1)
        {
        	e1.printStackTrace();
        }
        
        
    } 
}

