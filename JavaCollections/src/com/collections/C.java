package com.collections;

public class C {
	
	
	/*
	 * //what is best practiece of declaring a string //in the below 2
	 * 
	 * String s1= "naveen"; String s2=new String("Raghav");
	 */
        char[] c = {'n','a','v','e','n'};
        String s = new String(c);
        public static void main(String[] args) {
			C obj = new C();
			obj.printm();
			
			
			String s1="hello";
			s1=s1.concat("how r u");
			System.out.println(s1);
			s1="naveen";
			System.out.println(s1);
		}
		private void printm() {
			// TODO Auto-generated method stub
			System.out.println(s);
		}
}
