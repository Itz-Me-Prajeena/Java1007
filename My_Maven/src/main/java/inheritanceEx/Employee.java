package inheritanceEx;

public class Employee 
{
	int basic_salary=10000;
	String name="Priya";
	public void display()
	{
		System.out.println("Employee name = "+name);
	}

	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		obj.display();
		System.out.println("Basic salary = "+obj.basic_salary);

	}

}
