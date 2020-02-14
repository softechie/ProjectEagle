package com.pe.l1.javasecurity;

import com.pe.l1.utility.ExitModule;

public class Security {

public static void intro(){
		
        System.out.println("Java Security : Java security technology includes a large set of APIs, tools, and implementations of commonly used security algorithms, mechanisms, and protocols.\n "
        		+ "The Java security APIs has a wide range of areas, including cryptography, public key infrastructure, secure communication, authentication, and access control.\n "
        		+ "Java security provides the developer with a comprehensive security framework for writing applications, and also provides the user or administrator with a set of tools to securely manage applications.\n"
        		+ "Java SE security provides built-in security features such as cryptography, authentication and authorization,platform security, public key infrastructure and many more.\n"
        		+ "The Java Class Library provides a number of APIs related to security, such as standard cryptographic algorithms, authentication, and secure communication protocols.\n\n"
        		+ "This cryptographic functionality in Java is provided mainly by two libraries\n"
        		+ "1. Java Cryptography Architecture (JCA)\n"
        		+ "2. Java Cryptography Extension (JCE)\n"
        		+ "JCA, is tightly integrated with the core Java API, and delivers the most basic cryptographic features. The latter one, JCE, provides various advanced cryptographic operations.\n"
        		+ "The API functions and classes defined in JCA and JCE allow cryptographic operations and describes various objects and security concepts to be performed in Java applications.\n "
        		+ "All classes belonging to JCA and JCE are called engines.All JCA engines are located in the java.security package, whereas the JCE classes are located in the javax.crypto package.\n\n"
        		+ "The JCA is a major piece of the platform, and contains a provider architecture and a set of APIs for digital signatures, message digests (hashes), certificates and certificate validation,\n"
        		+ "encryption (symmetric/asymmetric block/stream ciphers), key generation and management, and secure random number generation.\n"
        		+ "These APIs allow developers to easily integrate security into their application code.\n"
        		+ "JCE is and extension for JCA which provides a framework and implementation for encryption, key generation and key agreement, and Message Authentication Code (MAC) algorithms.\n "
        		+ "An engine class provides the interface to a specific type of cryptographic service, independent of a particular cryptographic algorithm or provider.\n\n"
        		+ "The engines either provide:\r\n" + 
        		"cryptographic operations (encryption, digital signatures, message digests, etc.),\r\n" + 
        		"generators or converters of cryptographic material (keys and algorithm parameters), or\r\n" + 
        		"objects (keystores or certificates) that encapsulate the cryptographic data and can be used at higher layers of abstraction.");
        ExitModule.pressEnterToExit();
    }
}
