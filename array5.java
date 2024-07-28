package com.basciprograms.arrays;

public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{2,3,5,8,1};
		int b[]=new int[a.length];
		int i, first=a[0],last=a.length;
		b[0]=a[0]+a[1];
		b[b.length-1]=a[a.length-1]+a[a.length-2];
		for(i=1;i<a.length-1;i++)
		{
		  b[i]= a[i-1]+a[i+1];
		  
		}
		for(int temp:b) {
			
			System.out.println(temp);
		}
		

	}

}
