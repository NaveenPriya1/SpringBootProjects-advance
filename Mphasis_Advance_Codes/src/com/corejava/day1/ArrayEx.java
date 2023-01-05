package com.corejava.day1;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
         int sum=0;
         for(int i=0;i<=14;i++) {
        	 sum+=A[i];
         }
         System.out.println("sum of all elements in the array is "+sum);
         // storing is 15 th index
         A[15]=sum;
         
         
         
         //to find avearage
         int average=sum/A.length;
         A[16]=average;
         
         System.out.println("average of the elements of the array is "+average);
         
         
         //the minimum element of array is
         int min=A[0];
         for(int i=1;i<A.length;i++) {
        	 if(A[i]<min)
        		 min=A[i];
         }
         System.out.println("minimum number is "+min);
         A[17]=min;
         
         ////printing array
         System.out.println("final array is ");
         for(int ar:A) {
        	 System.out.print(ar+" ");
         }
	}

}
