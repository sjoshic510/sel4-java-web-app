package com.learn.java;

public class Test_001_DataTypes {

	public static void main (String[]args) {
		non_primitive_data_type();
//		System.out.println("hello usa");
//		subi_method_01();
	}
	
	
	
	
	public static void subi_method_01() {
		System.out.println("k chha ");
		System.out.println("thik chha");
		
	}
	
	
	public static void primitive_data_types() {
		byte b = 100; //max value = 127(2^7 - 1)
		short c = 1500;
		long bigNum = 10000000;
		float fl = 2.5f;
		
		// most use importants 
		char letter = 'B';
		boolean java = true;
		int num = 4;
		double dub = 6.5;
		String wordOrSentence = "love bianca";
		
		
	}
	
	public static void non_primitive_data_type(){
		
		String name = "java";
		int[] intArr = {1, 2, 3, 4};
		String[] words = {"apple", "ball", "cat"};
		
		System.out.println(intArr[0]);
		
		System.out.println(intArr[1]);
	
		System.out.println(intArr[2]);
		
		System.out.println(intArr[3]);
		
		
		System.out.println(words[0]);
		
		System.out.println(words[1]);
		
		System.out.println(words[2]);
		
		
		
		
		
	}
	
	
	
	
	
}
