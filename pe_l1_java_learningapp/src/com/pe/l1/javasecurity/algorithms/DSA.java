package com.pe.l1.javasecurity.algorithms;

import com.pe.l1.utility.ExitModule;

public class DSA {
	
	public static void intro()
	   {  
		 System.out.println("--------- Digital Signature Algorithm (DSA)-----------\n"
        +"DSA is one of the many algorithms that are used to create digital signatures for data transmission.\n"
        + "In DSA, a pair of numbers is created and used as a digital signature.\n"
        + "These are generated using some specific algorithms. They allow the receiver to authenticate the origin of the message.\n"
        + "DSA is used only to create the signatures. They cannot be used for encryption of data."
        + "This DSA generates two digital signatures by applying complex and unique mathematical functions.\n"
        + "\n-------------working of DSA-----------\n"
        + "Digital signatures are work on the principle of two mutually authenticating cryptographic keys. "
        + "Signatures are based on public/private key pairs. With public key algorithm like RSA, one can create a mathematically linked private key and public key. One can sign a digital message with his private key.\n"
        + "Signature related data can be encrypted by a person with the use of a private key. The private key should always be with a person who wants to create a digital signature.\n"
        + "The public and the private key, both can always be derived from one another as they are related mathematically. Signer’s public key is the only way to decrypt this data.\n"
        + "One can give the public key to anyone who needs verification of the signer’s signature. It is vital to keep private key secret as one can generate your signature on a document with the help of this.\n"
        + "In this manner, the authentication digital signature is done. In a digital signature, validly is only assured by public and private keys.\n"
        + "\nOn the other hand, the digital signature algorithm does not use a private key to encrypt data.\n"
        + " Also, a digital signature algorithm does use a public key to decrypt this data.\n"
        + "To create a digital signature with two 160-bit numbers, DSA works on the principle of a unique mathematical function.\n"
        + "These two numbers are made by using the private key and the message digest.\n"
        + "\nAs the public key is not used to authenticate the signature, the verification process is complex. "
        + "Both keys are used to secure data in a special digital signature algorithm for further security assurance.\r\n" + 
        "\r" + 
        "Now, a hash function is used to create a message digest. The generated message digest along with the DSA algorithm is what gives the digital signature.\n"
        + "This signature is then sent along with the message. At the receiving end, the same hash function is used to authenticate the source and the data.\n"
        + "\n-------------- Advantages of DSA---------------\n"
        + "Advantages of Digital Signature Algorithm\r\n" + 
        "1.Along with having strong strength levels, the length of the signature is smaller as compared to other digital signature standards.\r\n" + 
        "2.The signature computation speed is less.\r\n" + 
        "3.DSA requires less storage to work as compared to other digital standards.\r\n" + 
        "4.DSA is patent free so it can be used free of cost.\n"
        + "\n--------------Diadvantages of DSA---------------\n"
        + "1.It requires a lot of time to authenticate as the verification process includes complicated remainder operators. It requires a lot of time for computation.\r\n" + 
        "2.Data in DSA is not encrypted. We can only authenticate data in this.\r\n" + 
        "3.The digital signature algorithm firstly computes with SHA1 hash and signs it. Any drawbacks in cryptographic security of SHA1 are reflected in DSA because implicitly of DSA is dependent on it.\r\n" + 
        "4.With applications in both secret and non-secret communications, DSA is of the US National Standard."
		);
			
	   	
		 	ExitModule.pressEnterToExit();
  }

}
