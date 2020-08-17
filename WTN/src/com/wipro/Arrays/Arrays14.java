package com.wipro.Arrays;

public class Arrays14 {
	public static void main(String[] args) 
    { 
	 int l=args.length;
    int i;
    int arr[][] = new int[4][4];
    if(l<9)
    {
    System.out.println("enter 9 values");
    }
    if(l==9)
        
    {
        int k=0;
    for(i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            
        arr[i][j]=Integer.parseInt(args[k]);
        k++;
        }
        
    }
	int max=arr[0][0];
    System.out.println("The given array is:");
    for(i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
	if(arr[i][j]>max)
	max=arr[i][j];
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        
    }
    System.out.println("Maximim element is :"+max);    
    }  
   }
}

