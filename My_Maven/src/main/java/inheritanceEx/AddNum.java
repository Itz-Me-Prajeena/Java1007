package inheritanceEx;
import java.util.Scanner;
public class AddNum {
	int num1,num2;
	public int sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		num1=sc.nextInt();
		System.out.print("Enter second number : ");
		num2=sc.nextInt();
		sc.close();
		return num1+num2;
	}

}
