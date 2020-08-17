package com.wipro.Strings;

public class Strings1 {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("madam");
		if (str.equals(str.reverse()))
			System.out.println(str+" is a Palindrome");
		else
			System.out.println(str+" is not a Palindrome");
	}
}
