package com.basciprograms.arrays;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]=new int[]{1,0,2,0,3,0,4};//{1,2,3,4,0,0,0}
      int b[]=new int[a.length];
      for(int i=0;i<=a.length-1;i++)
      {
    	  if(a[i]>0)    
    	  {
    		  b[i]=a[i];
       	  System.out.print(b[i]);
    	  }
      }
      
	}

}
