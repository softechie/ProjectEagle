package com.pe.l1.exception_Handling.try_WithResources;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResourcesExample {
public static void main(String[] args) {
/*		try(FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\HD5052014\\Desktop\\Sample.txt")){      
			String msg = "----Welcome to Try with resources Example1----";
			
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			fileOutputStream.write(byteArray);  
			System.out.println("The following example writes a string into a file. \r\n" + 
					"It uses an instance of FileOutputStream to write data into the file. \r\n" + 
					"FileOutputStream is a resource that must be closed after the program is finished with it.\r\n" + 
					"So, in this example, closing of resource is done by itself try\n");
			System.out.println("--------Message written to file successfuly!---------");      
			}catch(Exception exception){  
			       System.out.println("Please specify the path to the file");  
			}
}
}*/
	
//Comment below to see the output of try with resources Example 1
//Uncomment below to see the output of try with multiple resources example 2

	
	
	try(    // Using multiple resources  
	        FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\HD5052014\\Desktop\\Sample.txt");  
	        InputStream input = new FileInputStream("C:\\Users\\HD5052014\\Desktop\\Sample.txt")){  
	        // -----------------------------Code to write data into file--------------------------------------------//  
	        String msg = "Welcome to Try with resources Example2 with multiple resources";   
	        
	        byte byteArray[] = msg.getBytes();  // Converting string into byte array      
	        fileOutputStream.write(byteArray);  // Writing  data into file  
	        
	        System.out.println("Data written into file:");  
	        System.out.println(msg +"\n");  
	        // -----------------------------Code to read data from file---------------------------------------------//  
	        // Creating input stream instance  
	        
	        DataInputStream inst = new DataInputStream(input);    
	        int data = input.available();    
	        // Returns an estimate of the number of bytes that can be read from this input stream.   
	        byte[] byteArray2 = new byte[data]; //    
	        inst.read(byteArray2);    
	        String str = new String(byteArray2); // passing byte array into String constructor  
	        System.out.println("Data read from file:");  
	        System.out.println(str ); // display file data  
	}catch(Exception exception){  
		System.out.println("Please specify the path to the file");  
	}     
	}     
	 
	} 


