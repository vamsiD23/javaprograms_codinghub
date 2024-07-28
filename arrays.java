package com.basciprograms.arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[]{1,2,3,4,5,16,20,10};
		int b[]=new int[a.length];
		
		for(int i=a.length-1;i>=0;i--)
		{
			b[i]=a[i];
			
			System.out.println(b[i]);
		}
		
		
		
		
	}

}
