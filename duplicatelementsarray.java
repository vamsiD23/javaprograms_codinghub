package com.basciprograms.arrays;

public class duplicatelementsarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a=new int[] {1,2,3,4,5,1,2,2};
       boolean b[]=new boolean[a.length];
       int x, count=1;
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
    	   System.out.println(a[x]+" "+count);
	}
	}
}
