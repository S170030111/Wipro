package com.wipro.Arrays;
import java.util.*;
public class Arrays5 {
	public static void main(String[] args) 
    { 
	
		
		int [] a= new int[args.length];
		
		int n=args.length;
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		System.out.println("Maximun two elements :"+a[n-2]+" "+a[n-1]);
		System.out.println("Minimum two elements :"+a[0]+" "+a[1]);
   }
}
