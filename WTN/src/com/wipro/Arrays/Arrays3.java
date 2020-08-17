package com.wipro.Arrays;

public class Arrays3 {
	public static void main(String[] args) 
    { 
	
		
		int z=-1;
		int [] a= new int[] {1,4,34,56,7};
		
		
		int k=56;
               
		for(int i=0;i<a.length;i++)
		{
			if(k==a[i])
			{
				
				z=i;
				break;
			}
		}
	
		System.out.println(z);
			
   }
}
