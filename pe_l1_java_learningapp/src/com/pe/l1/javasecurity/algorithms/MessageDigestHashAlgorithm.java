package com.pe.l1.javasecurity.algorithms;

import java.security.MessageDigest;

import com.pe.l1.utility.ExitModule;

public class MessageDigestHashAlgorithm {

	
	public static void intro()
	{
		
		 System.out.println("**********Message Digest Hash Algorithm********** \n"
		 		+ "\n Message digest algorithms rely on cryptographic hash functions to generate a unique value that is computed from data and a unique symmetric key.\n"
		 		+ "A cryptographic hash function inputs data of arbitrary length and produces a unique value of a fixed length.This fixed-length value is known as a message digest.\n"
		 		+ "Adding a unique symmetric key that is shared between a sender and receiver in order to compute a message digest value provides confidentiality to ensure that the message digest cannot be easily changed.\n"
		 		+ "Both the sender and receiver of the data (including the senders message digest) must share the same key for the receiver to generate an identical message digest.\n"
		 		+ "\nBy comparing the message digest generated in sender side with the message digest generated in receiver we say whether integrity followed or not.\n"
		 		+ "If the two message digests are identical, the data has not changed and thus integrity is achieved.\n"
		 		+ "If some other agent changes the data between the sender and receiver and hashes their own message digest without the correct key\n"
		 		+ "the new message digest, while representing the data, will not be the same as the message digest computed by the receiver using the correct symmetric key.\n"
		 		+ "The resulting value generated from the symmetric key (or MAC key) and the message digest is known as a Message Authentication Code (MAC)\n"
		 		+ "because it can be used to test for unauthorized alteration of both the data and the message digest.\n"
		 		+ "\nMessage digest ensures the integrity of the document. To provide authenticity of the message, digest is encrypted with sender’s private key.\n"
		 		+ "Now this digest is called digital signature, which can be only decrypted by the receiver who has sender’s public key.\n"
		 		+ "Now the receiver can authenticate the sender and also verify the integrity of the sent message.\n"
		 		+ "\nMD family comprises of hash functions MD2, MD4, MD5. Among these MD5 was most popular and widely used hash function for quite some years.\n"
		 		
		 		+ "\n-----------MD5 ALGORITHM----------------\n"
		 		+ "Message Digest Algorithm  MD5 was designed by Ronald Rivest in 1991 to replace an earlier hash function MD4\n"
		 		+ "It is a widely used cryptographic hash function that produces a 128-bit (16-byte) hash value.\n"
		 		+ " It’s very simple and straight forward, the basic idea is to map data sets of variable length to data sets of a fixed length.\r\n"
		 		+ "MD5 digests have been widely used in the software world to provide assurance about integrity of transferred file.\n"
		 		+ "For example, file servers often provide a pre-computed MD5 checksum for the files, so that a user can compare the checksum of the downloaded file to it.\n"
		 		+ "\nIn 2004, collisions were found in MD5. An analytical attack was reported to be successful only in an hour by using computer cluster.\n"
		 		+ "This collision attack resulted in compromised MD5 and hence it is no longer recommended for use.\n"
 				+"In response to the insecurities of MD5 hash algorithms, the Secure Hash Algorithm (SHA) was invented.\n"
		 		
 				+ "\n-----------Working of MD5------------\n"
				+"MD5 processes a variable-length message into a fixed-length output of 128 bits. "
				+ "The input message is broken up into chunks of 512-bit blocks (sixteen 32-bit words); the message is padded so that its length is divisible by 512.\n"
				+ "The padding works as follows: first a single bit, 1, is appended to the end of the message.\n"
				+ "This is followed by as many zeros as are required to bring the length of the message up to 64 bits fewer than a multiple of 512.\n"
			
				+ "Now, these blocks are processed by the MD5 algorithm, which operates in a 128-bit state, and the result will be a 128-bit hash value.\n"
				+ "After applying MD5, generated hash is typically a 32-digit hexadecimal number.\r\n"
				
				+ "\n----------MD5 implementation in JAVA----------\n"
				+ "\nTo calculate cryptographic hashing value in Java, MessageDigest Class is used, under the package java.security.\n"
				+ "\nMessagDigest Class provides following cryptographic hash function to find hash value of a text, they are:\r\n" + 
				"MD2\r\n" + 
				"MD5\r\n" + 
				"SHA-1\r\n" + 
				"SHA-224\r\n" + 
				"SHA-256\r\n" + 
				"SHA-384\r\n" + 
				"SHA-512"
				+ "These Algorithms are initialize in static method called getInstance().\n"
				+ "\ncalling getInstance() with algorithm MD5 in MessageDigest Class\r\n" + 
				"MessageDigest md = MessageDigest.getInstance(\"MD5\"); \r\n" 

				+ "\nAfter selecting the algorithm it calculate the digest value and return the results in byte array.\n"
				+ "BigInteger class is used, which converts the resultant byte array into its sign-magnitude representation.\n"
				+ "This representation converts into hex format to get the MessageDigest\n"
			
				
				+ "\r\n *****************Refer to package com.pe.l1.javasecurity.algorithmexamples and Md5Example class to know the implementation on MD5 in java**************"
		 	);
		 
		 
		 
		 ExitModule.pressEnterToExit();
	}
	
}
