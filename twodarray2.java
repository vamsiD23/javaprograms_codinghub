package com.basciprograms.arrays;

public class twodarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a[]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[] b[]=new int[3][3];
		int r=3;
		int c=3;
		
		
		for(int i=0; i<r;i++)
		{int sum=0;
			
			for(int j=0;j<c;j++)
			{
				
               sum=sum+a[i][j];
               System.out.print(a[i][j]+" ");
               
			}
			System.out.print(sum);
			
			System.out.println(" ");
	    }
		
	}

}
