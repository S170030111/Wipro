

package com.wipro.FlowControlStatements;

public class FlowControlStatements13 {
	public static void main(String[]args)
	 {
	      int i,j;
	       for(i=10;i<=99;i++)
	       { 
	    	   int c=0;
	    	   for(j=2;j<=i;j++)  
		         {
		               if(i%j==0) {
		                    c++;
		               }
		         }
	    	   if(c==1)
	    	   {
	    		   System.out.println(i);
	    	   }
	       }
	 }
}
