package package1;

public class TestClassC extends TestClassA
{
	public static void main(String args[])
	{
		System.out.println("Calling parent method");
		TestClassC obj =new TestClassC();
		obj.testMethod1();
	}

}
