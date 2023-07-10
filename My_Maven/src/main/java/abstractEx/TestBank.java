package abstractEx;

public class TestBank {

	public static void main(String[] args) {
		Bank bank;
		bank=new SBI();
		System.out.println("Interest rate of SBI = "+bank.getInterestRate()+"%");
		bank= new Axis();
		System.out.println("Interest rate of Axis bank = "+bank.getInterestRate()+"%");

	}

}
