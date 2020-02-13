package com.pe.l1.java8.ioBasicOpern.StringReader;

import com.pe.l1.utility.ExitModule;

public class StringReader {
    
	 public static void intro(){
	        System.out.println("StringReader takes input string and changes it into character stream"
	        		+"The Java StringReader class enables you to turn an ordinary String into a Reader. This is useful if you have data as a String but need to pass that String to a component that only accepts a Reader");
	        System.out.println("String input = \"Input String... \";\r\n" + 
	        		"StringReader stringReader = new StringReader(input);\r\n" + 
	        		"\r\n" + 
	        		"int data = stringReader.read();\r\n" + 
	        		"while(data != -1) {\r\n" + 
	        		"  //do something with data...\r\n" + 
	        		"  doSomethingWithData(data);\r\n" + 
	        		"\r\n" + 
	        		"  data = stringReader.read();\r\n" + 
	        		"}\r\n" + 
	        		"stringReader.close();");
	        System.out.println("This example first creates a StringReader, passing a String as parameter to the StringReader constructor. Second, the example reads the characters one character at a time from the StringReader. Finally the StringReader is closed.");
	        ExitModule.pressEnterToExit(); 
	 }
}
