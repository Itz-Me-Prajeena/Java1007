package package1;

public class TestClassA 
{
	public void testMethod1()
	{
		System.out.println("Invoking method1");	
	}
	
	public static void main(String args[])
	{
		TestClassA obj=new TestClassA();
		obj.testMethod1();
	}

}



/* void testMethod2()
{
	 this.testMethod1();

System.out.println("Invoking method2");	
}*/