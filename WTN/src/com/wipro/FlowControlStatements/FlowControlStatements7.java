package com.wipro.FlowControlStatements;

public class FlowControlStatements7 {
	public static void main(String[]args)
    {
     
      char ch = 'a';
          if(ch>=65 && ch<=90)
              System.out.println(ch+"->"+Character.toLowerCase(ch));
          else if(ch>=97 && ch<=122)
              System.out.println(ch+"->"+Character.toUpperCase(ch));
           else 
               System.out.println("Invalid Character!!!");
     }
}
