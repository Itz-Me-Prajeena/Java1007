package abstractEx;

public class FulltimeEmployee extends EmployeeSalary {

	
	int calculateSalary(int hour, int payment) 
	{
		int salary=payment*hour;
		
		return salary;
	}
	

}
