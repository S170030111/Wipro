package com.wipro.Inheritance;

class Employee extends Person
{
	double annualSalary;
	int year;
	int insuranceNumber;
	
	Employee(String name,double annualSalary,int year,int insuranceNumber)
	{
		super(name);
		this.annualSalary=annualSalary;
		this.year=year;
		this.insuranceNumber=insuranceNumber;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
}

