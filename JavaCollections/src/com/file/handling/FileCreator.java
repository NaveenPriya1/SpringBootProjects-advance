package com.file.handling;

import java.io.File;
import java.io.IOException;

public class FileCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      File file = new File("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.png");
      
      try {
		if(file.createNewFile())
			System.out.println("File created successfully");
		else
			System.out.println("File not created");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
