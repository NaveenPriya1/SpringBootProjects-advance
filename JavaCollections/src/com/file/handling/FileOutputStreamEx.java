package com.file.handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fileis = new FileOutputStream("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.html");
			String s="Naveen this is ball";
			byte [] b = s.getBytes();
			fileis.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
