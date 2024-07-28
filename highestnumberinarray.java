package com.basciprograms.arrays;
import java.util.Random;
public class highestnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[] {4,6,7,91,23,99};
		int min = Integer.MAX_VALUE;
		System.out.println(min);
		Random s=new Random();
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
				min=a[i];						
		}
		System.out.println(min);
		System.out.println("maximum value of an arrayis " +min);
		
	}

}
