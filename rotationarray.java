package com.basciprograms.arrays;

public class rotationarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {1,2,3,4,5};
   
   for(int j=0;j<4;j++)
   { 
	   int t=a[a.length-1];
   
   for (int i=a.length-1;i>0;i--)
   {
	   a[i]=a[i-1];
   }
   a[0]=t;
   }
   for(int temp:a)
   {
	   System.out.println(temp);
   }
	}

}
