package encapsulationEx;

public class Bank {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.setPin(12345);
		System.out.println("Pin = "+bank.getPin());;

	}

}
