package com.file.handling;

import java.io.File;

//to create folder
public class FolderCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File file = new File("C:\\Users\\DELL\\Downloads\\FileHandling");
       
           if(file.mkdir())
           System.out.println("\"FileHandling\" folder created successfully");
           else
        	   System.out.println("Folder not created");
          //file.delete();
	}

}
