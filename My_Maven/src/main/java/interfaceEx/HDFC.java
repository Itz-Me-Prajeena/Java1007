package interfaceEx;

public class HDFC implements RBI {

	
	
	public double recurringDeposit(double amount, int duration) 
	{
		
		System.out.println("Deposit amount = "+amount);
		System.out.println("RD duration = "+duration+" months");
		System.out.println("Interest rate = "+interestRate+"%");
		
		//double t = duration / 12.0; //time duration in years
		double interestDeci = interestRate / 100.0; //interest rate in decimal
		System.out.println("interestDeci = "+interestDeci);
		double maturityAmt = amount*Math.pow(1 + interestDeci, duration); //maturity amount
		 //double a = p * Math.pow(1 + i/4, 4*t);
		// A = P * (1 + R/N)^(Nt)
		return maturityAmt;
	}
	

}
