package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class MessageAuthenticationCode {

	public static void intro()
	{
		
		 System.out.println("**********Message Authentication Code (MAC)********** \n "
		 		+ "In cryptography, a message authentication code (MAC), is a short piece of information used to verify the integrity of message and authenticate a message—in other words,\n"
				 +"to confirm that the message came from the stated sender (its authenticity) and has not been changed. \n"
		 		+"Here in MAC, sender and receiver share same key where sender generates a fixed size output called Cryptographic checksum or Message Authentication code and appends it to the original message.\n"
				 +"On receiver’s side, receiver also generates the code and compares it with what he/she received thus ensuring the originality of the message.\n "
		 		+ "The MAC value protects both a message's data integrity as well as its authenticity, by allowing verifiers (who also possess the secret key) to detect any changes to the message content. \n"
		 		+ "MAC algorithms can be constructed from other cryptographic primitives, like cryptographic hash functions (like MD5,SHA) or from block cipher algorithms (OMAC, CBC-MAC and PMAC).\n\n"
		 		
		 		+ "A MAC provides a way to check the integrity of information transmitted over or stored in an unreliable medium, based on a secret key. \n"
		 		+ "Typically, message authentication codes are used between two parties that share a secret key in order to validate information transmitted between these parties.\n"
		 	    +"\n There are four types of MACs:\r\n" + 
		 	    "\r\n" + 
		 	    "1.       Unconditionally secure\r\n" + 
		 	    "\r\n" + 
		 	    "2.       Hash function-based\r\n" + 
		 	    "\r\n" + 
		 	    "3.       Stream cipher-based\r\n" + 
		 	    "\r\n" + 
		 	    "4.       Block cipher-based\r\n" + 
		 	    "\r\n" + 
		 	    "The most common approach to creating a MAC has been to use block ciphers like DES, but hash function-based MACs,\n "
		 	    + "or HMACs (Keyed-Hashing for Message Authentication), which use a secret key in conjunction with a cryptographic hash function to produce a hash, have become more widely used.\n"
		 		+ "Examples : CMAC , HMAC, UMAC, VMAC, NMAC, PMAC, One-time MAC\n"
		 		
		 		+"\n--------Working of MAC--------\n"+
		 		"A MAC requires two inputs: a message and a secret key.This key is known only to the originator of the message and its intended recipient(s). \n"
		 		+"This allows the recipient of the message to verify the integrity of the message and authenticate that the messege's sender has the shared secret key.\n"
		 		+"If a sender doesn’t know the secret key, the hash value would then be different, which would tell the recipient that the message was not from the original sender.\n"
		 		+ "\n At sender side:\n"
		 		+ "Step1: Message + secret key -> Mac algorithm = MAC code \n"
		 		+ "Step2: MAC code appended with Message\n"
		 		+ "\n At receiver side:\n"
		 		+ " Step1: This appended message + MAC + secret key -> Mac algorithm = generates a MAC code\n"
		 		+"Step 2: This generated MAC code at receiver side and Mac appended in message is checked whether both are equal or not.\n "
		 		+ "If Both MAC values are equal then we say message is authentic.\n"
		 		
		 		+ "\n -------Limitations in MAC-----–\r\n" + 
		 		"There are 2 limitations in MAC due to it's symmetric nature of operation.\n"
		 		+"1. Establishment of shared secret key: This requires establishment of shared secret through a secured channel prior to use of MAC.\n"
		 		+"2. Inability to Provide Non-Repudiation : MAC technique does not provide a non-repudiation service.Non-repudiation is the assurance that a message originator cannot deny any previously sent messages and commitments or actions.\n"
		 		+ "If the sender and receiver get involved in a dispute over message origination, MACs cannot provide a proof that a message was indeed sent by the sender.\n"
		 		
		 		+"Also, if we do reverse process we can reach plain text or even the key. Here we have mapped input to output, to overcome this we move on to hash functions which are “One way”.\n"
		 		
		 		+ "Both these limitations can be overcome by using the public key based digital signatures\n");
		 
		 System.out.println("************Hash based Message Authentication Code (HMAC)**********\n "
				 
				+ "HMAC stands for Keyed-Hashing for Message Authentication (or) Hash based message authentication. A MAC mechanism that is based on cryptographic hash functions is referred to as HMAC.\n"
				+ "It is a specific type of Message Authentication code(MAC) which can be used with any cryptographic hash function (like MD5, SHA1, and SHA256)\n "
				+ "over the data (to be authenticated) and a shared secret key and the resulting MAC algorithm is termed as HMAC-MD5 or HMAC-SHA1 or HMAC-SHA-256 .\n"
				 +" Data integrity/message authentication is usually achieved through a mechanism known as HMAC.It is specified in RFC 2104.\n"
				 + "\nGenerally, the cryptographic strength of HMAC depends on the cryptographic strength of the underlying hash function, size of the hash output and the size and quality of the key.\n"
				 + "HMACs are almost similar to digital signatures. They both enforce integrity and authenticity.\n "
				 + "They both use cryptographic keys. And they both employ hash functions. \n"
				 + "The main difference is that digital signatures use asymmetric keys, while HMACs use symmetric keys.\n"
				 + "This HMAC is implemented using a secure hash function (that means the function which doesn't produce the same outputs for different input data) which guarantees the security of the HMAC algorithm.\n"
				 + "HMAC does not encrypt the message. Instead, the message (encrypted or not) must be sent alongside the HMAC hash.\n"
				 + "Parties with the secret key will hash the message again themselves, and if it is authentic, the received and computed hashes will match.\n"
				 + "\n Mostly used in TLS protocol for providing security over internet by appending HMAC to packet header.It is faster to compute.Hash functions such as SHA-1 and SHA-256 are significantly faster than ciphers like DES.\n"
				 + "HMAC provides the server and the client each with a private key that is known only to that specific server and that specific client.\n "
				 + "The client creates a unique HMAC, or hash, per request to the server by hashing the request data  with the private keys and sending it as part of a request.\n"
				 + "\n--------What makes HMAC more secure than MAC?--------\n "
				 + "In HMAC, the key and message are hashed in seperate steps.\n"
				 + "HMAC(key, msg) = H(mod1(key) || H(mod2(key) || msg))\n"
				 + "This ensures the process is not susceptible to extension attacks that add to the message and can cause elements of the key to be leaked as successive MACs are created.\n"
				 + "Once the server receives the request and regenerates its own unique HMAC, it compares the two HMACs. If they're equal, the client is trusted and the request is executed.\n"
				 + " This process is often called a secret handshake.\n"
				 +"\n----------Working of HMAC---------\n"
				 + "HMAC uses two passes of has computation. The secret key helps to find the inner and outer keys. \n"
				 +"In other words, the first pass of the algorithm generates an internal hash derived from the message and the inner key. \n"
				 + "Furthermore, the second pass generates the final HMAC code obtained from the inner hash result and the outer key. Overall, the algorithm is capable of providing immunity against length extension attacks.\n"
				 + "\n -------Limitations in HMAC-----–\r\n"
				 + "Since HMAC uses symmetric key model means secret key is shared by sender and receiver ie. only between 2 parties.\n"
				 + "This HMAC cannot be used when multiple parties need security.That's why it is only used where a client and server needs security.\n"
				 
				 + "\r\n *****************Refer to package com.pe.l1.javasecurity.algorithmexamples and HmacExample class to know the implementation on HMACSHA-256 in java**************"				 
				 );
		 ExitModule.pressEnterToExit();
	}
}
