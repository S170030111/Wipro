package com.wipro.FlowControlStatements;

public class FlowControlStatements16 {
	public static void main(String[]args)
	 {
	       
	       int n = Integer.parseInt(args[0]);
	       int sum=0,s;
	       while(n>0)
	       {
	    	   s=n%10;
	    	   sum=sum*10+s;
	    	   n=n/10;
	       }
	       System.out.print(sum);
	 }
}
