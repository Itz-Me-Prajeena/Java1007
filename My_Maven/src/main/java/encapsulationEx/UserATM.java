package encapsulationEx;

import java.util.Scanner;

public class UserATM 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a pin: ");
		int pin1=sc.nextInt();
		BankATM bank=new BankATM();
		bank.setPin1(pin1);
		System.out.println("Enter the amount to withdraw : ");
		int amount=sc.nextInt();
		if (bank.validatePin(pin1))
		{
			System.out.println("Pin is valid. Withdrawal successful.");
            System.out.println("You have withdrawn " + amount + " rupees.");
        } 
		else 
		{
            System.out.println("Pin is invalid. Withdrawal failed.");
			
		}
		sc.close();

	}

}
