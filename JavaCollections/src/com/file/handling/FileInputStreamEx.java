package com.file.handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.txt");
		try {
			FileInputStream fileis = new FileInputStream("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.txt");
			
			for(int i=0;i<file.length();i++) {
				System.out.print((char)fileis.read());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
