package com.basciprograms.arrays;

import java.util.Arrays;

class Second
{
	void m(int a[])
	{
		
		
		Arrays.sort(a);
		for(int t:a)
		{
		System.out.println(t);
		}
		int max=0;
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>max)
				max=a[x];
		}
     System.out.println("second highst number is  "+max);
	}

}
public class secondlowestvaluearray {

	public static void main(String[] args) {
		Second obj=new Second();
		int a[]=new int[] {1,4,3,77,55,4};
		obj.m(a);
		
	}
}	
	