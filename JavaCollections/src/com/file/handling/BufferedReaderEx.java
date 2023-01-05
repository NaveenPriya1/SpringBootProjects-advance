package com.file.handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader fileReader = new FileReader("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.docx");
			
			BufferedReader br= new BufferedReader(fileReader);
			
			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
