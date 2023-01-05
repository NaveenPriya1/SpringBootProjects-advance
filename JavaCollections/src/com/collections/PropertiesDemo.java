package com.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
			Properties p=new Properties();
			
			FileInputStream fis=new FileInputStream("db.properties");
			p.load(fis);
			System.out.println(p);
	}

}
