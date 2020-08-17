package com.wipro.Arrays;
public class Arrays9 {
	
		
	public static void main(String[] args) {
		int l = args.length;
		int[] a = new int[l];
		  int k = 0;
		  
		  for (int i=0;i<l;i++) 
		  {
	       int d = Integer.parseInt(args[i]);
		      if (d!=10)
		      {
		          a[k++]=d;
		      }
		  }
	for(int i=0;i<l;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
	}

	   
