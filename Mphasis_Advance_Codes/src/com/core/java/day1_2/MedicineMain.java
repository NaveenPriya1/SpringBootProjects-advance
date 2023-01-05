package com.core.java.day1_2;

public class MedicineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedicineInfo obj[] = new MedicineInfo[12];
		
		for(int i=0;i<12;i++) {
			switch(i%3) {
			case 0:
				obj[i]=new Tablet();
				break;
			case 1:
				obj[i]=new Syrup();
				break;
			case 2:
				obj[i]=new Ointment();
				break;
			}
		}
		
		for(int i=0;i<12;i++) {
			System.out.println("object # "+(i+1));
			obj[i].displayLabel();
			
			if(obj[i] instanceof Tablet)
				System.out.println("Tablet");
			if(obj[i] instanceof Syrup)
				System.out.println("TSyrup");
			if(obj[i] instanceof Ointment)
				System.out.println("Ointment");
		}
	}

}

 interface MedicineInfo{
	void displayLabel();
}
 
 class Tablet implements MedicineInfo{

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------");
		System.out.println("Name  : yamin tablet");
		System.out.println("Store in a cool and dry place ");
		System.out.println("--------------------------------------");
	}
	 
 }
 
 class Syrup implements MedicineInfo{


	@Override
	public void displayLabel() {
		System.out.println("--------------------------------------");
		System.out.println("Name  : Bycus Syrup");
		System.out.println("Shake well before use ");
		System.out.println("--------------------------------------");
		
	} 
	 
 }
 
 class Ointment implements MedicineInfo{

	@Override
	public void displayLabel() {
		System.out.println("--------------------------------------");
		System.out.println("Name  : yamin tablet");
		System.out.println("Store in a cool and dry place ");
		System.out.println("--------------------------------------");
		
	}

	
	 
 }