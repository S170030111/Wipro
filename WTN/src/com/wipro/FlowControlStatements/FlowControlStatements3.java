package com.wipro.FlowControlStatements;

public class FlowControlStatements3 {
	public static void main(String[]args)
	{
	if(args.length==0){
	System.out.print("No values");
	}
	else{
	for(int i=0;i<args.length;i++)
	{ 
	System.out.print(args[i]);
	if(i!=args.length-1){
	System.out.print(",");
	}
	}
	}
	}
}
