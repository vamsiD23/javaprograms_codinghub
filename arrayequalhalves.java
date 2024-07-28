package com.basciprograms.arrays;

public class arrayequalhalves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		halves obj=new halves();
		oddindex obj2=new oddindex();
		obj2.main();
		//obj.m1();
	}
}

// first half is ascending order second half is descending order
class halves
{
	void m1()
	{
      int a[]=new int[] {6,5,8,1,2,4,6,96,9,10};
      
      for(int temp:a)
      
      for(int i=0;i<a.length;i++)
      {
    	  for (int j=i+1;j<(a.length-1)/2;j++)
    	  {
    		  if(a[i]>a[j])
    		  {
    			  int t=a[i];
    			  a[i]=a[j];
    			  a[j]=t;
    		  }
    	  }
      }
      
      for(int i=((a.length-1)/2)+1;i<a.length-1;i++)
      {
     	 for(int j=i+1;j<=a.length-1;j++)
     	 {
     		 if(a[i]<a[j])
     		 {
     		 int temp=a[i];
     		   a[i]=a[j];
     		   a[j]=temp;
     		 } 
     	 }
      }
      System.out.println("after sorting the array is");
      for(int temp:a)
      {
     	 System.out.println(temp);
      }
      
	}

}

// odd index array in ascending order even index array in descending order
class oddindex
{
	void main()
	{
		int a[]=new int[] {6,5,8,1,2,4};
		for(int temp:a)
		
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+2;j<a.length;j++)
				{
					if(i%2==0)
					{
						if(a[i]<a[j])
						{
						int t=a[i];
					    a[i]=a[j];
					    a[j]=t;
						}
					    
					}
					else
					{
						if(a[i]>a[j])
						{
							int t=a[i];
						    a[i]=a[j];
						    a[j]=t;
						}
					}
				}	
			}
		for(int temp:a)
		{
			System.out.println(temp);
		}
	}
}
