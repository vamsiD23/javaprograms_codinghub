package com.basciprograms.arrays;

public class arraypalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pali obj=new pali();
		int a[]=new int[] {11,54,55,89,990};
		
		
		
			obj.m(a);
	}
}	
		
		
class pali
{
	
	void m(int a[])
	{
		for(int x=0;x<=a.length-1;x++)
	    {
		  int temp=a[x],rev=0;
		   while(temp>0)	
		    {
	        int rem=a[x]%10;
	       rev=rev*10+rem;
	    	 temp=temp/10;
	    	 
	     }
	    
	      if (a[x]==rev)
	    	  System.out.println(a[x]+" is palindrome");
	      else 
	    	  System.out.println(a[x]+" is not palindrome");
		 
       }

	}

}
