package com.basciprograms.arrays;
class arms
{
    void m(int a[])
   {

	for(int i=0;i<=a.length-1;i++)
	{
		int count=0,temp=a[i],power=0,sum=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		temp=a[i];
		while(temp>0)
		{
				int rem=temp%10;
					power=(int)Math.pow(rem,count);
					sum=sum+power;
					temp=temp/10;
			
		}
			if(a[i]==sum)
				System.out.println(a[i]+" armstrong");
		}
   }
}
public class armstrongarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arms obj=new arms();
		int[] a=new int[] {2,3,153,370,123};
		obj.m(a);
         
	}

}
