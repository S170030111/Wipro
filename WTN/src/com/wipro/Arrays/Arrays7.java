package com.wipro.Arrays;
import java.util.*;
public class Arrays7 {
	static int removeDuplicates(int a[], int n) 
    { 
        if (n == 0 || n == 1) 
            return n; 
        int j = 0; 
       
        for (int i = 0; i < n-1; i++) 
            if (a[i] != a[i+1]) 
                a[j++] = a[i]; 
       
        a[j++] = a[n-1]; 
       
        return j; 
    } 
    public static void main(String[] args) 
    { 
	
		int [] a= new int[args.length];
		int n=args.length;
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		n = removeDuplicates(a, n); 
  
        for (int i=0; i<n; i++) 
           System.out.print(a[i]+" "); 
   }
}
