package interfaceEx;


public class TestBankInterface 
{

	public static void main(String[] args) 
	{
		BankInterface bank;
		bank=new SBIInter();
		System.out.println("Interest rate of SBI = "+bank.getInterestRate()+"%");
		bank= new AxisInter();
		System.out.println("Interest rate of Axis bank = "+bank.getInterestRate()+"%");

	}

}
