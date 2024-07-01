package com.learning;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class IOStreamsEg {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = null;

		
		 fileInputStream = new FileInputStream("src/com/learning/testFile");
		Reader inputStreamReader = new InputStreamReader(fileInputStream);
		int fileData = inputStreamReader.read();
		System.out.println("File Data...\n");
		while(fileData!=-1) {
			System.out.println(" Ascii value : " +fileData+", char : "+(char)fileData);
			fileData = inputStreamReader.read();
		}
		}
				
	

}
