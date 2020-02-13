package com.pe.l1.java8.ioBasicOpern.BufferReader;

import com.pe.l1.utility.ExitModule;

public class BufferReader {
       
	 public static void intro(){
	        System.out.println("Java.io.BufferedReader Class in Java. Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines. The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.");
	        System.out.println("The Java BufferedReader is similar to the BufferedInputStream but they are not exactly the same. The main difference between BufferedReader and BufferedInputStream is that BufferedReader reads characters (text), whereas the BufferedInputStream reads raw bytes.");
	        System.out.println("import java.io.BufferedReader;\r\n" + 
	        		"import java.io.FileReader;\r\n" + 
	        		"import java.io.IOException;\r\n" + 
	        		" \r\n" + 
	        		"public class BufferedReaderExample\r\n" + 
	        		"{\r\n" + 
	        		"    public static void main(String[] args)\r\n" + 
	        		"    {\r\n" + 
	        		"        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(\"C:\\\\temp\\\\testOut.txt\")))\r\n" + 
	        		"        {\r\n" + 
	        		"  \r\n" + 
	        		"            String currLine;\r\n" + 
	        		"  \r\n" + 
	        		"            while ((currLine = bufferedReader.readLine()) != null)\r\n" + 
	        		"            {\r\n" + 
	        		"                System.out.println(currLine);\r\n" + 
	        		"            }\r\n" + 
	        		"  \r\n" + 
	        		"        }\r\n" + 
	        		"        catch (IOException e)\r\n" + 
	        		"        {\r\n" + 
	        		"            e.printStackTrace();\r\n" + 
	        		"        }\r\n" + 
	        		"    }\r\n" + 
	        		"}");
	        System.out.println("BufferedReader reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.");
	        ExitModule.pressEnterToExit();
	    }
}
