package com.greens;

public class Employee {
	//() --> Parameter
	public void employeeDetails() {   //empty parameter
		System.out.println("Employee Details");
	}
	

		
	public void employeeDetails(int a) {   //datatype
		System.out.println("Employee Id :"+a);
	}
	
	
	public void employeeDetails(int a,String b) {  //datatype Order
		System.out.println(b+":"+a);
	}
	
	
	public void employeeDetails(int a,int b) {		//datatype Count
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		emp.employeeDetails();
		
		emp.employeeDetails(1001);
		
		emp.employeeDetails(75,25);
		
		emp.employeeDetails(20000, "Employee Salary");
		
		
		
	}
	

}
