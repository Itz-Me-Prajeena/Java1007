package interfaceEx;

import java.util.Scanner;

public class DepositMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount per month: ");
        double amount = sc.nextDouble();
        System.out.println("Enter the duration in months: ");
        int duration = sc.nextInt();
        HDFC hdfc=new HDFC();
        double maturityAmt = hdfc.recurringDeposit(amount, duration);
        double total_interest = maturityAmt - (amount*duration); 
        System.out.println("You will earn Rs "+maturityAmt+" with total interest Rs "+total_interest);
        //System.out.println("Enter the interest rate in percentage: ");
        //double duration = sc.nextDouble();
        sc.close();

	}

}
