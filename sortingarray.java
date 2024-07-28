package com.basciprograms.arrays;

public class sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]=new int[] {50,45,34,23,67,99};
         for(int temp:a)
         {
        	 System.out.println(temp);
         }
         for(int i=0;i<a.length-2;i++)
         {
        	 for(int j=i+1;j<=a.length-1;j++)
        	 {
        		 if(a[i]<a[j])
        		 {
        		 int temp=a[i];
        		   a[i]=a[j];
        		   a[j]=temp;
        		 } 
        	 }
         }
         System.out.println("after sorting the array is");
         for(int temp:a)
         {
        	 System.out.println(temp);
         }
		
		
	}

}
