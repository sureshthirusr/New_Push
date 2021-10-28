package com.greens;

public class Check_Data {	
	
	
	public void refrence() {

		System.out.println("Refrence id is 001");
		
		
	}
	
	
	public static void main(String[] args) {
		
		Check_Data cd= new Check_Data();
		Head_Val hv= new Head_Val();
		
		cd.refrence();
		cd.refrence();
		cd.refrence();
		hv.valida();
		cd.refrence();
		cd.refrence();
		hv.valida();
		cd.refrence();
		hv.valida();
		cd.refrence();
		hv.valida();
		
		
	}
}
