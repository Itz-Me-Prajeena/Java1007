/* Program to withdraw amount from an ATM 
 * • Class 1- Bank One method to set pin from „User‟ class and validate Pin in another method [Valid pins – 1001, 1234, 1212] 
 * Pin number should declared as private 
 * • Class 2 – User Get the pin from User 
 */

package encapsulationEx;

public class BankATM 
{
	private int pin1;

	public void setPin1(int pin1) 
	{
		this.pin1 = pin1;
	}

	 public boolean validatePin(int pin1) 
	 {
	  		 
		 return this.pin1 == pin1 && (pin1 == 1001 || pin1 == 1234 || pin1 == 1212);
	 }

}
