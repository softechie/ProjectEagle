package com.pe.l1.java11.files;

import java.nio.file.Path;

public class Files {
	
	public static void main(String[] args) {


Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
System.out.println(path);
String s = Files.readString(path);
System.out.println(s); //This was posted on JD

}

	private static Path writeString(Object createTempFile, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object createTempFile(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String readString(Path path) {
		// TODO Auto-generated method stub
		return null;
	}
}