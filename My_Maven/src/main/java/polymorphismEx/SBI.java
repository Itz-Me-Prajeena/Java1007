package polymorphismEx;

public class SBI extends Bank 
{
	float getRateOfInterest()
	{
		return 8.4f;
	}  
	public static void main(String args[])
	{
		Bank b =new SBI(); 
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		
	}

}
