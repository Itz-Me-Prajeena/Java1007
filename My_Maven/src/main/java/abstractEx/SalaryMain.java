package abstractEx;

import java.util.Scanner;

public class SalaryMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter payment per hour: Rs ");
		int payment=sc.nextInt();
		System.out.print("Enter total working hours of contract employee: ");
		int hour=sc.nextInt();
		System.out.println("\n...Calculating salary...\n");
		
		ContractorSalary con=new ContractorSalary();
		int conSalary = con.calculateSalary(hour, payment);
		System.out.println("Contractor Employee's Salary = Rs "+conSalary);
		FulltimeEmployee full = new FulltimeEmployee();
		int hour1=8;
		int fullSalary= full.calculateSalary(hour1, payment);
		System.out.println("Full-time Employee's Salary = Rs "+fullSalary);
		sc.close();

	}

}
