package com.greens;

public class Polymorphism {
	
	
	public void employee() {  //empty parameter
		
		System.out.println("Today's class is polymorphism");
		
	}

	public void employee(int a) {
		
		int a1=a+a;
		System.out.println("Addition of 2 numbers :" +a1);

	
	}
	
	public void employee(int a, int b) {
		int a1=a*b;
		System.out.println("Addition of 2 numbers :" +a1);
		
	}
		
	
	public void employee(int d, int c, int a, int f, int b) {

		int a1= d-b;
		System.out.println("Addition of 2 numbers :" +a1);
	}
	public void employee(int b, String a) {

		System.out.println("course name and batch:"  + a +","+ b);
	}
	
    public void employee(String d, int e) {
    	System.out.println("course name and batch:"  + d +","+ e);
		
	}
	
	public static void main(String[] args) {
		
		Polymorphism p= new Polymorphism();
		p.employee();
		p.employee(7);
		p.employee(7, 8);
		p.employee(1, 3, 1, 6, 7);
		p.employee(7, "Java");
		p.employee("Selenium", 3);
        p.employee();
        p.employee(1000);
        p.employee(70);
        p.employee(2, 3, 9, 6, 7);
        p.employee("Selenium", 7);
        p.employee(10, "Java");
        p.employee(7, 10);
		
		
		
		
		
		
	}
	
	
}
