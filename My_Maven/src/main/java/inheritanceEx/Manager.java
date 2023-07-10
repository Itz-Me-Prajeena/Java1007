package inheritanceEx;

public class Manager extends Employee
{
	int salary=18000;

	public static void main(String[] args) 
	{
		Manager obj=new Manager();
		obj.display();
		System.out.println("Basic salary of employee = "+obj.basic_salary);

	}

}
