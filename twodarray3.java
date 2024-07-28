package com.basciprograms.arrays;

public class twodarray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a[]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[] b[]=new int[3][3];
		int r=3;
		int c=3;
		int max=0;
		for(int i=0; i<r;i++)
		{
			 max=0;
			
			for(int j=0;j<c;j++)
			{
				if(max<a[i][j])
					max=a[i][j];
				
			}
			System.out.println("highest values in a row "+i+" is "+max);
			}
		

	}

}
