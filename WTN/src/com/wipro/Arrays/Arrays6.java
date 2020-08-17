package com.wipro.Arrays;
import java.util.*;
public class Arrays6 {
	public static void main(String[] args) 
    { 
	
		int [] a= new int[] {56,34,12,98,1};
		
		
		Arrays.sort(a);
		System.out.println("Sorted order:");
		for(int i=0;i<a.length;i++)
		{
		    System.out.print(a[i]+" ");
		}
   }
}
