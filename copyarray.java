package com.basciprograms.arrays;

public class copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,57,84,37,3,4,5,9,5,93};
		int b[]=new int [a.length/2];
		int c[]=new int[a.length/2];
		for(int i=0;i<a.length/2;i++)
		{
			b[i]=a[i];
			
		}
		int j=0;
		for(int i=a.length/2,y=0;i<a.length;i++,j++)
		{
			c[j]=a[i];
		}
	
     for(int t:b)
     {
    	 System.out.print(" "+t);
     }
     System.out.println("\n second array");
     for(int t2:c)
     {
    	 System.out.print(" "+t2);
     
	}
	}
}
