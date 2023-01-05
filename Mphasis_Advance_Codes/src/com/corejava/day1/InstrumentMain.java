package com.corejava.day1;

public class InstrumentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Instrument obj[]= new Instrument[12];
       
       for(int iLoop=0;iLoop<12;iLoop++) {
    	   switch(iLoop%3) {
    	   case 0:
    		   obj[iLoop]= new Piano();
    		   break;
    	   case 1:
    		   obj[iLoop]= new Flute();
    		   break;
    	   case 2:
    		   obj[iLoop]= new Guitar();
    		   break;
    	   }
       }
       
       for(int iLoop=0;iLoop<12;iLoop++) {
    	   System.out.println("------------------------------------");
    	   System.out.println("Object "+(iLoop+1));
    	   
    	   obj[iLoop].play();
    	   
    	   if(obj[iLoop] instanceof Piano) {
    		   System.out.println("Piano");
    	   }if(obj[iLoop] instanceof Flute) {
    		   System.out.println("Flute");
    	   }if(obj[iLoop] instanceof Guitar) {
    		   System.out.println("Guitar");
    	   }
       }
	}

}
abstract class Instrument{
	public abstract void play();
}

class Piano extends Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing tan tan tan tan");
	}
	
}

class Flute extends Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing toot toot toot toot ");
	}
	
}

class Guitar extends Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is playing tin tin tin");

	}
	
}