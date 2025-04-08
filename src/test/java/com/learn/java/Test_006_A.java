package com.learn.java;

public class Test_006_A {
	
	static String aFor = "apple";
	static String bFor = "ball";	
	
	private String cFor = "CAT";
	final String dFor = "Dog";
	protected String eFor = "Egg";
	public String fFor = "Fish";
	
	
	
	public static void main(String[] args) {
		System.out.println(aFor);
		aFor = "ant";
		
		System.out.println(aFor);
		
		aFor = "aeroplan";
		System.out.println(aFor);

	}

}
