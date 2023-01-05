package com.file.handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.docx");
		
			fileWriter.write("This file one data writing ");
			fileWriter.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
