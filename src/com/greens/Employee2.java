package com.greens;

public class Employee2 {
	
	public void employee_Details() { //empty parameter
		
   System.out.println( "I am a employee");
	}
	
	public void employee_Details(int a) {
	
		   int a1=a*a;
		
    System.out.println(a1  );
       
	}
	

	public void employee_Details(int a, int b) {
		
		  int a2=a+b;
		  System.out.println(a2  );
	       

	}

	public void employee_Details(String  c, int d) {
		System.out.println(c+"" +d );
	}

	public void employee_Details( String e, int c, String d) {

		System.out.println(c+"," +d+ " ," +e );
	
	  
	     
	
	}
	
	public static void main(String[] args) {
		Employee2 emp= new Employee2();
		emp.employee_Details(5);
		emp.employee_Details(25, 25);
		emp.employee_Details("Madhu", 77 );
		emp.employee_Details("core",7, "java");
		
	}
	
	
	
	
}