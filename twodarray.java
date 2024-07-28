package com.basciprograms.arrays;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a[]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[] b[]=new int[3][3];
		int r=3;
		int c=3;
		for(int i=0; i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if((i+j)==2)
				System.out.print(a[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
