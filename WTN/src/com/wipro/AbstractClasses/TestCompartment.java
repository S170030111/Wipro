package com.wipro.AbstractClasses;

import java.util.Random;

public class TestCompartment {
	public static void main(String[] args) {
		Compartment []c=new Compartment[10];
		Random rand=new Random();
		for(int i=0;i<10;i++)
		{
			int randomNumber=rand.nextInt(4)+1;
			System.out.println(randomNumber);
			if(randomNumber==1)
				c[i]=new FirstClass();
			if(randomNumber==2)
				c[i]=new Ladies();
			if(randomNumber==3)
				c[i]=new General();
			if(randomNumber==4)
				c[i]=new Luggage();
			
			System.out.println(c[i].notice());
			
		}
		
	}
}
