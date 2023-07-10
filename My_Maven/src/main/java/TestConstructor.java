

public class TestConstructor {
	static String bank_name="Axis Bank";
	static int account_number;
	String customer_name;
	int balance;

	public TestConstructor()
	{
		account_number = 12345;
	}
	public TestConstructor(String customer_name,int balance) 
	{
		this.customer_name=customer_name;
		this.balance=balance;
	}
	public void displayCustomerDetails()
	{
		
		System.out.println("Customer name is "+customer_name);
		System.out.println("Bank name is "+bank_name);
		System.out.println("Account number is "+account_number);
		System.out.println("Balance amount is "+balance);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestConstructor tc=new TestConstructor();
		TestConstructor tc1=new TestConstructor("Priya",50000);
		tc1.displayCustomerDetails();
	}

}
