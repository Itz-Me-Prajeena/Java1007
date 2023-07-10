package package2;

import package1.TestClassA;

public class ClassTestB 
{
	public static void main(String args[])
	{
		System.out.println("Invoking method of another package");
		TestClassA obj=new TestClassA(); //Calling non-parent class's method by creating that class's object
		obj.testMethod1();
	}

}
