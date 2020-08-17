package com.wipro.FlowControlStatements;

public class FlowControlStatements6 {
	
	    public static void main(String[]args)
	    {
	       String s = args[0];
	       String s1 = "Female";
	       String s2 = "Male";
	       int age = Integer.parseInt(args[1]);
	          if(s.equals(s1) && age<=58)
	              System.out.println("percentage of interest is 8.2%. ");
	          else if(s.equals(s1) && age<=100)
	              System.out.println("percentage of interest is 9.2%. ");
	          else if(s.equals(s2) && age<=58)
	              System.out.println("percentage of interest is 8.4%. ");
	          else 
	              System.out.println("percentage of interest is 10.5%. ");
	    }
	}