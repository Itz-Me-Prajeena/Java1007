package inheritanceEx;
import java.util.Scanner;
public class GetEmployeeSalary {
	float basic_pay,deduction,bonus;
	public void enterSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basic pay ");
		basic_pay=sc.nextFloat();
		System.out.print("\nEnter deduction ");
		deduction=sc.nextFloat();
		System.out.print("\nEnter bonus ");
		bonus=sc.nextFloat();
		sc.close();
		
	}
	/*public static void main(String args[])
	{
		GetEmployeeSalary obj=new GetEmployeeSalary();
		obj.enterSalary();
		
	}*/

}
