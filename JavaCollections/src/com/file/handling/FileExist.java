package com.file.handling;

import java.io.File;

public class FileExist {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.txt");
		
		if(file.exists())
		System.out.println("File is exist");
		else
			System.out.println("File not exist");	
	}
}
