package com.learning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class BufferReaderEg {

	public static void main(String[] args) throws IOException {

		InputStream fileInputStream = new FileInputStream("src/com/learning/testFile");
		  InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,Charset.forName("UTF-8"));
//		  InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,Charset.forName("UTF-16"));
	   BufferedReader reader = new BufferedReader(inputStreamReader);
	 
		int fileData = inputStreamReader.read();
		System.out.println("\nFile Data...\n");
		while(fileData!=-1) {
			System.out.println(" Ascii value : " +fileData+",  char : "+(char)fileData);
			fileData = inputStreamReader.read();
	   
 }
		
	}

}
