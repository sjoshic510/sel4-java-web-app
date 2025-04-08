package com.learn.java;

public class Test_003_ForLoop {

	public static void main(String[] args) {

		//Example 1 
		for(int i=1; i<=5; i++) {
			System.out.println("good"+i);
		}
		
		
		//Example 2
		for(int j=5; j>=1; j--) {
			System.out.println("apple"+j);
		}
		
		
		
		// Example 3
		int[] nums = {1,2,3,4,5,6,100};
		
		for(int a:nums) {
			System.out.println(a);
		}

		//Example 4
		String[] words = {"a","b","c","d"};
		for(String b:words) {
			System.out.println(b);
		}
		
	}

}
