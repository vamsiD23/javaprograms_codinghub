package com.basciprograms.arrays;

public class array1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
        int a[]=new int[]{1,2,3,4,5,6};
        int b[]=new int[a.length/2];
        int c[]=new int[a.length];
        int d[]=new int[a.length];
        
        int x=0;
        for(x=0;x<=b.length-1;x++)
        {
        	b[x]=a[x];
        	System.out.println("values of b is " +b[x]);
        }
       
        
        for( x=b.length;x<=a.length;x++)
        {
        	c[x]=a[x];
        	System.out.println("values of c is "+c[x]);
        }
       
        for(x=0;x<a.length-1;x++)
        {
        	d[x]=b[x]+c[x];
        	System.out.println(d[x]);
        }
        
        
        
	}

}
