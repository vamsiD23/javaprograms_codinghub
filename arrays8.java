package com.basciprograms.arrays;

public class arrays8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=new int[] {1,2,3,4,5};
     
     int sum=0;
     for(int i=0;i<=a.length-1;i++)
     {
    	 sum=sum+a[i];
    	 
     }
     for(int i=0;i<=a.length-1;i++)
     {
    	 a[i]=sum/a[i];
    	 
    	 
     }
     for(int t:a)
	 {
		 System.out.println(t);
	 }
     
     
    }
}


