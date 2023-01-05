package com.java.program;

public class Patient {
	
	private String name;
	private int age;
	private String disease;
	private int bill;
	
	public Patient() {
		super();
	}

	public Patient(String name, int age, String disease, int bill) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.bill = bill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ", bill=" + bill + "]";
	}
	
	

}
