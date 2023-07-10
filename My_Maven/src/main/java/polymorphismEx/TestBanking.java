package polymorphismEx;

public class TestBanking
{

	public static void main(String[] args) 
	{
		Bank b;
		b=new Axis();
		System.out.println("Axis Rate of Interest: "+b.getRateOfInterest());
		b=new ICICI();
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());

	}

}
