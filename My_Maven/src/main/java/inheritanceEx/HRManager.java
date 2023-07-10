package inheritanceEx;

public class HRManager extends Manager{
	int ba=5000;
	
	public void display()
	{
	System.out.println("HRManager's display method");
	System.out.println("HRManager's ba ="+ba);
	System.out.println("Manager's Salary = "+salary);//Can directly use Parent's instance variable in Child's instance method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManager obj=new HRManager();
		Manager obj1=new Manager();
		
		obj.display();
		System.out.println("Manager's display method ");
		obj1.display();// if child and parent has same method name then use associated class's object to call those methods
		System.out.println("Manager's Salary = "+obj.salary); //need to call Parent's instance variable using object(Parents or child's) in child's static method
		

	}

}
