package com.wipro.Arrays;

public class Arrays11 {
public static void main(String[] args) {
	int len =args.length;
	int c=0;
	for(String i : args)
	{
		int d = Integer.parseInt(i);
		if(d==1||d==4)
		{
			c++;
		}
	}
	if(c==len)
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
}
}
