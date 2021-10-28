package com.greens;

public class C extends B {
	
	
	
	     public void multilevel() {

	    	 System.out.println("I am a Grand Child");
	    	 
	    	 
		}
	
	
	public static void main(String[] args) {
		
		C c1= new C();
		c1.single();
		//c1.single2();
		c1.multilevel();
		
		
	}

}
