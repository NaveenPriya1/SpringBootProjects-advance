package com.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataFileTransfer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="";
		File file = new File("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.txt");
		try {
			FileReader fileReader = new FileReader("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.txt");
			
			for(int i=0;i<file.length();i++) {
				s=s+(char)fileReader.read();
				//System.out.print((char)fileReader.read());
			}
			System.out.println(s);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.docx");
			fileWriter.write(s);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
