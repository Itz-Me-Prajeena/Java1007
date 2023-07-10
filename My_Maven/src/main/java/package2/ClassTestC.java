package package2;

import package1.TestClassA;

public class ClassTestC extends TestClassA   //Child class of Another package's Parent class

{
	public static void main(String args[])
	{
		ClassTestC obj=new ClassTestC(); // Can directly call the Parent's method in child class using child class object
		obj.testMethod1();
	}

}
