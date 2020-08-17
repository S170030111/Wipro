package com.wipro.Arrays;
import java.util.*;

public class Arrays2 {
	 public static void main(String[] args) 
	    { 
		int[] a=new int[] {1,2,3,4,5};
			int n=a.length;
			Arrays.sort(a);
			System.out.println("Maximum element :"+a[n-1]);
			System.out.println("Minimum element :"+a[0]);	
	   }
}
