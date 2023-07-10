package polymorphismEx;

import java.util.Scanner;

public class TestDiscount 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total purchase amount : ");
		double total=sc.nextDouble();
		sc.close();
		Discount d;
		d=new OffSeason();
		System.out.println("You will get discount(15% OFF) of Rs: "+d.getDiscount(total)+ " on Off-season purchase of Total Rs: "+total);
		d=new OnSeason();
		System.out.println("You will get discount(40% OFF) of Rs: "+d.getDiscount(total)+ " on on-season purchase of Total Rs: "+total);
	
	}

}
