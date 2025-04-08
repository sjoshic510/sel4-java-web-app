package com.learn.java;

public class Test_002_demo {

	
	
	public static void main(String[] args) {

		 new Test_001_demo().methodB();//public method calling need to use new keyword
		
	//	 new Test_001_demo().methodC();//private method calling but doesnot work because it private

		Test_001_demo.methodA();// static method doesnot need new keyword and ()

	}

}
