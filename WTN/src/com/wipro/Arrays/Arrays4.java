package com.wipro.Arrays;

public class Arrays4 {
	public static void main(String[] args) 
    { 
	
		int[] a=new int[] {65,66,67,68,69};
		
		
		String str =null;
          for(int i=0;i<a.length;i++){
            str = Character.toString((char)a[i]);
            System.out.println(str);
        }
          
   }
}
