package com.wipro.Inheritance;

public class TestEmployee {
public static void main(String[] args) {
	Employee e=new Employee("Prem",30000.0,2020,834783209);
	System.out.println(e.getName());
	System.out.println(e.getAnnualSalary());
	System.out.println(e.getYear());
	System.out.println(e.getInsuranceNumber());
	
	
}
}
