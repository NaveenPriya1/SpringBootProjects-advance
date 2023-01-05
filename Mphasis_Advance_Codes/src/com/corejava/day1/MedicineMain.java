package com.corejava.day1;

public class MedicineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedicineInfo obj[] = new MedicineInfo[3];
		
		double d= Math.random() *  4;
		int i=(int) d;
		System.out.println(i);

       switch(i) {
       case 1:
    	    obj[0] = new Tablet();
    	    obj[0].displayLabel();
    	    break;
       case 2:
	         obj[1] = new Tablet();
	         obj[1].displayLabel();
	         break;
       case 3:
	         obj[2] = new Tablet();
	         obj[2].displayLabel();
	         break;
	         default:
	        	 System.out.println("Invalid choice ");
	        	 break;
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