package inheritanceEx;

public class OperationsManager extends Manager 
{
int total_salary=0;

	public static void main(String[] args) {
		
		OperationsManager obj=new OperationsManager();
		System.out.println("Manager's salary = "+obj.salary);
		obj.total_salary=obj.salary+10000;
		System.out.println("OperationsManagers Total salary = "+obj.total_salary);
		

	}

}
