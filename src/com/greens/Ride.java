package com.greens;

public class Ride extends Over  {
	
	 
		  @Override
		public void toys() {
			  byte a=7;
			   byte c=7;
			   int sum= a+c;
			   System.out.println(sum);
			   
			   
			  
		}
		  
		  
		  
		  @Override
		public void toys1(int a) {
		// TODO Auto-generated method stub
			  
			  int b1= a;
			  System.out.println(b1);
			  
		super.toys1(a);
		}
		  
		  
 
	
	
	
	
	public static void main(String[] args) {
		Ride r= new Ride();
		r.toys();
		r.toys1(80);
//		r.toys1(b);
		
	}

}
