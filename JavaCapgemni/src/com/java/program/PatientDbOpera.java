package com.java.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatientDbOpera {
	
	public static void main(String[] args) {
		
		
		Patient p1= new Patient("Suresh", 20, "Corona", 25000);
		Patient p2= new Patient("Ramesh", 28, "Fever", 5000);
		Patient p3= new Patient("Jogn", 30, "corona", 15000);
		Patient p4= new Patient("Zensar", 5, "Corona", 25000);
		
		//adding patients into a list
		List<Patient> patients=Arrays.asList(p1,p2,p3,p4);
		
		//filtering patients of corona
		System.out.println("----Patients Suppering from Corona------");
		patients.stream().filter(p -> p.getDisease().equalsIgnoreCase("corona")).forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("----Patients Suppering from Corona and age > 18-----");
		patients.stream().filter(p -> p.getDisease().equalsIgnoreCase("corona")&& p.getAge()>18).forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("-----Average Bill Paid By Corona Patients------");
		Double average=patients.stream().filter(p -> p.getDisease().equalsIgnoreCase("corona")).
				collect(Collectors.averagingDouble(Patient::getBill));
		
		System.out.println("Average amount For Corona Patient ="+average);
		
		
		System.out.println("-----Total Bill Paid By Corona Patients------");
		Double total=patients.stream().filter(p -> p.getDisease().equalsIgnoreCase("corona")).
				collect(Collectors.summingDouble(Patient::getBill));
		
		System.out.println("Average amount For Corona Patient ="+total);
	}
	
	

}
