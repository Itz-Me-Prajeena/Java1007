package abstractEx;

public class ContractorSalary extends EmployeeSalary {

	
	int calculateSalary(int hour, int payment) {
		
		int salary=payment*hour;
		
		return salary;
	}
	

}
