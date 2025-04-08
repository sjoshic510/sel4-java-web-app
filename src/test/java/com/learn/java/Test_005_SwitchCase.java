package com.learn.java;

public class Test_005_SwitchCase{

	public static void main(String[] args) {
		// learning about switch case statement

		int day = 6;
		String day_name = "";

		switch (day) {
		
		case 1:
			day_name = "sunday";
			break;

		case 2:
			day_name = "monday";
			break;

		case 3:
			day_name = "tuesday";
			break;

		case 4:
			day_name = "wednesday";
			break;

		case 5:
			day_name = "thrusday";
			break;

		default:
			day_name = "invalid day";
			

		}

		System.out.println("The day is:" + day_name);
	}
}
