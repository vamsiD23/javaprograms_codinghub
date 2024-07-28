package com.basciprograms.arrays;

public class sumofduplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,2,3,4,5,1,2,2,2,3};
	       boolean b[]=new boolean[a.length];
	       int x, count=1,sum=0;
	       for(x=0;x<b.length;x++)
	       {  count=1;
	       		if(b[x]==true) 
	            	continue;
	       
	       		for(int y=x+1;y<a.length;y++)
	       		{
	       			if(a[x]==a[y])
	       			{
	       				count++;
	       				b[y]=true;
	    	   }
	       
	       }
	       
	       if(count>1)
	       {
	    	  sum=sum+a[x];
	    	  
		    }
	       
	       }
	       System.out.println("sum of values is "+sum);
	}

}
