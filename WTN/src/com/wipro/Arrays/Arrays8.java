package com.wipro.Arrays;

public class Arrays8 {
	 public static void main(String[] args) 
	    { 
		
		
			int [] a= new int[args.length];
			int n=args.length;
			int sum=0;
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(args[i]);
			}
			for (int i = 0; i < n; i++) {
	            if (a[i] == 6) {
	       		    for (int j = i + 1; j < n; j++) {
	            		if (a[j] == 7) {
	                         i = j+1;
	                      
	          	  }
	       		 }
	    		}
	            
	   		 sum += a[i];
			}

	         System.out.println(sum);
	   }
}
