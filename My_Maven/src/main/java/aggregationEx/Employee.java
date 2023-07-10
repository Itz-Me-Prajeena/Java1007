package aggregationEx;

public class Employee {
	int id;
	String name;
	EmpAddress address;  //Aggragating EmpAddress class
	public Employee(int id, String name, EmpAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display()
	{
		System.out.println("Employee id = "+id);
		System.out.println("Employee name = "+name);
		System.out.println("Employee city = "+address.city);
		System.out.println("Employee country = "+address.country);
		System.out.println("Employee zip = "+address.zip);
		
	}
	public static void main(String[] args) {
		EmpAddress obj=new EmpAddress("TVM","India",654123);
		
		Employee obj1=new Employee(1,"Priya",obj);
		obj1.display();
		
		// TODO Auto-generated method stub

	}

}
