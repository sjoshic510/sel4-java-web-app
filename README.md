To Run all Will run all the class with "Test" infront
	mvn test

To Run specefic class
	mvn test -Dtest=Test_002_Maximize

To Run specefic class
	mvn test -Dtest=Test_001_LunchBrowers

To Run specefic method inside specefic class
	mvn test -Dtest=Test_002_Maximize#test_lunch_walmart test
	
Other related use-cases
mvn test -Dtest=Test1 // Run a single test class

mvn test -Dtest=Test1,Test2 // Run multiple test classes

mvn test -Dtest=Test1#testFoo* // Run all test methods that match pattern 'testFoo*' from a test class.

mvn test -Dtest=Test1#testFoo*+testBar* // Run all test methods match pattern 'testFoo*' and 'testBar*' from a test class.

# How to open the Allure Report
	Allure report automatically generate after mvn run
	----------to view----------- 
	C:\Users\Bijaya Chhetri\eclipse-workspace-new\testmvn_project>allure serve allure-results