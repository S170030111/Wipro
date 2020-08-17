

package com.wipro.FlowControlStatements;

public class FlowControlStatements14 {
	public static void main(String[]args)
	{
		int n=Integer.parseInt(args[0]);
		int sum=0,s;
		while(n>0)
		{
			s=n%10;
			sum=sum+s;
			n=n/10;
		}
		System.out.print(sum);
	}
}

