package com.wipro.FlowControlStatements;

public class FlowControlStatements12 {
	 public static void main(String[]args)
	 {
	       
	       int n = Integer.parseInt(args[0]);
	int c=0;
	      if(n==0||n==1)
	         System.out.println(n+"is neither prime nor composite!!!!");
	     else{
	         for(int i=2;i<=n;i++)  
	         {
	               if(n%i==0)
	                    c++;
	         }
	          if(c==1)
	              System.out.println("Prime Number!!!");
	          else
	              System.out.println("Not a Prime Number!!!");
	     }
	  }
}
