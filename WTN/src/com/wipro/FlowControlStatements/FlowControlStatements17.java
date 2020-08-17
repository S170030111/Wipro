package com.wipro.FlowControlStatements;

public class FlowControlStatements17 {
	public static void main(String[]args)
	 {
	       
	       int n = Integer.parseInt(args[0]);
	       int v=n;
	       int sum=0,s;
	       while(n>0)
	       {
	    	   s=n%10;
	    	   sum=sum*10+s;
	    	   n=n/10;
	       }
	       if(sum==v)
	       {
	    	   System.out.print(v+" is a palindrome");
	       }
	       else {
	    	   System.out.print(v+" is not a palindrome"); 
	       }
	 }
}
