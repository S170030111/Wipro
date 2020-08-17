package com.wipro.Collections.Lists.Lists2;

public class Lists2 {

		public static void main(String[] args) {
			EmployeeDB empDb = new EmployeeDB();
			
			Employee emp1 = new Employee(101, "Prem", "prem@gmail.com", 'M', 25000);
			Employee emp2 = new Employee(102, "vamsi", "vamsi@gmail.com", 'F', 30000);
			Employee emp3 = new Employee(103, "ram", "ram@gmail.com", 'M', 20000);
			
			empDb.addEmployee(emp1);
			empDb.addEmployee(emp2);
			empDb.addEmployee(emp3);

			for (Employee emp : empDb.listAll())
				System.out.println(emp.GetEmployeeDetails());
			
			System.out.println();
			empDb.deleteEmployee(102);
			
			for (Employee emp : empDb.listAll())
				System.out.println(emp.GetEmployeeDetails());
			
			System.out.println();
			
			System.out.println(empDb.showPaySlip(103));
		}

	}
