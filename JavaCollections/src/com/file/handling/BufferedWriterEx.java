package com.file.handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\DELL\\Downloads\\FileHandling\\NewFile.docx");
			BufferedWriter writer=new BufferedWriter(fileWriter);
			
			writer.write("Hi this is buffered writer");
			writer.newLine();
			writer.write("this is that");
			writer.newLine();
			writer.write("ok");
			writer.newLine();
			writer.close();
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
