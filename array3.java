package com.basciprograms.arrays;

public class  array3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[]{15,7,9,14,11,12,13,8,11,11};
		int count=0, count1=0;
		for(int temp:a)//for each
		{
			count++;	
		}
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{  
			
			if(a[i]==9)
			{
				System.out.println("index of the element is "+i);
			}
			else if(a[i]==11)
			{
				count1++;
				
			}
			
		}
		
		
		System.out.println("how many times 11 in array is  "+count1);
		
	}

}
