package com.wipro.FlowControlStatements;

public class FlowControlStatements15 {
	public static void main(String[]args)
	{
 if(args.length==0)
 {
	 System.out.print("Please enter an integer number"); 
 }
 else {
 int n=Integer.parseInt(args[0]);
 int s=n+1;
 while(n>0)
 {
	 for(int i=0;i<s-n;i++)
	 {
		 System.out.print("* ");
		 
	 }
	 System.out.print("\n");
	 
	 n--;
 }
 }
	}
}
