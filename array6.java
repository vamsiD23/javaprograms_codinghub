package com.basciprograms.arrays;

public class array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]=new int[] {10,20,30,40,50,60};//20,10,40,30,60,50
       int b[]=new int[a.length];
       int temp;
       int i;
       for(i=0;i<a.length;i++)
       {
    	   if(i%2==0)
    	   {
    		   temp=a[i];
    		   a[i]=a[i+1];
    		   a[i+1]=temp;
    		   
    	   }
    	   System.out.println(a[i]);
       }
       
	}

}
