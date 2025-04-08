package com.learn.java;

public class ConstructorDemo {

	//Constructor = same name as class & doesn't have return type.
	
	
	String car;
	int year;
	
	
	//Constructor
	ConstructorDemo(String car, int year){
		this.car = car;
		this.year = year;
	}
	
	
	public void methodA() {
		System.out.println("Car model :" + car);
		System.out.println("Car year :" + year);
	}
	
	public static void main(String[] args) {
	// object creation	
		ConstructorDemo aa = new ConstructorDemo("BMW" , 2025);
		aa.methodA();		
		
	}

}
