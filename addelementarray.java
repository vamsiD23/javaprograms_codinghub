package com.basciprograms.arrays;

public class addelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add obj=new add();
		delete obj2=new delete();
		sumelements obj3=new sumelements();
		positive obj4=new positive();
		obj4.m4();
		//obj3.m3();
		//obj2.m2();
		
	}}
class add
{
	void m1()
	{
       int a[]=new int[] {1,3,5,67,9,7};
       for(int i=0;i<a.length;i++)
       {
    	   if(i==2)
    	   {
    		   a[i]=45;
    	   }
       }
       for(int t:a)
       {
    	   System.out.println(t);
       }
	}

}
class delete
{
	void m2()
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80,90};
		
		for(int t:a)
		{
			if(t==50)
				continue;
			System.out.println(t);
		}
		
	}
}
class sumelements
{
	void m3()
	{
		int a[]=new int[] {10,20,30,40};
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			sum+=a[x];
		}
		System.out.println(sum);
	}
	
}
class positive
{
	void m4()
	{
		int a[]=new int[] {10,-3,4,-6,7,0,3};
		int p=0,n=0,e=0,o=0;
		 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=1)
				p++;
			else if(a[i]<0)
				n++;
			else if(a[i]%2==0)
				e++;
			else if(a[i]%2!=0)
				o++;
		}
		System.out.println("even count"+e);
		System.out.println("positive count"+p);
		System.out.println("negative count"+n);
		System.out.println("odd count "+o);
	}
}
	