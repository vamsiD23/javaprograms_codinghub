package com.basciprograms.arrays;

public class squarearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[] {1,2,3,4,5};
        int b[]=new int[a.length];
        for(int i=0;i<=a.length-1;i++)
        {
        b[i]=(int)Math.pow(a[i],2);
        
        System.out.println(b[i]);
        }
        
        
        
	}

}
