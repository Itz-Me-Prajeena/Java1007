import java.util.Scanner;
public class TestStaticMethod {
	static String bank_name="Axis Bank";
	static int account_number;
	String customer_name;
	int balance;
	public static void displayBankName()
	{
		System.out.println("Bank name is "+bank_name);
	}
	public static int getAccountNumber()
	{
		//this.account_number=account_number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number");
		account_number=sc.nextInt();
		return account_number;
	}
	public void displayCustomerDetails()
	{
		customer_name="Priya";
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Balance ");
		balance=sc1.nextInt();
		System.out.println("Customer name is "+customer_name);
		System.out.println("Bank name is "+bank_name);
		System.out.println("Account number is "+account_number);
		System.out.println("Balance amount is "+balance);
	}
	public static void main(String[] args) {
		
		displayBankName();
		getAccountNumber();
		TestStaticMethod tsm=new TestStaticMethod();
		tsm.displayCustomerDetails();

	}
}
