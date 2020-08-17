package com.wipro.FlowControlStatements;

public class FlowControlStatements1 {
	public static void main(String[]args)
	{
	int a=Integer.parseInt(args[0]);
	if(a>0)
	{
	System.out.println(args[0]+" is positive number");
	}
	else if(a<0)
	{
	System.out.println(args[0]+" is negative number");
	}
	else
	{
	System.out.println(args[0]+" is zero");
	}
}
}
