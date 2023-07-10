package inheritanceEx;

public class TotalSalary extends HRACalculation 
{
float total_salary;
public void totalSalary()
{
	total_salary=basic_pay+bonus+hra-deduction-pf;
	//System.out.println("Total salary = "+total_salary);
}
public void salaryslip()
{
	System.out.println("\n---------Salary slip---------");
	System.out.println("\nBasic pay             "+basic_pay);
	System.out.println("Deduction              -"+deduction);
	System.out.println("HRA                    +"+hra);
	System.out.println("PF                     -"+pf);
	System.out.println("Bonus                  +"+bonus);
	System.out.println("\nTotal Salary(by hand) "+total_salary);
	
}
	public static void main(String[] args) 
	{
		TotalSalary obj=new TotalSalary();
		obj.enterSalary();
		obj.calculateHRA();
		obj.totalSalary();
		obj.salaryslip();

	}

}
