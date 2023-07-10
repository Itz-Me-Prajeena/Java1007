package aggregationEx;

import java.util.Scanner;

public class StudAddress2 {
	String city,country;
	int zip;
	public void getAddress()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter city : ");
		city=sc.nextLine();
		System.out.print("Enter country : ");
		country=sc.nextLine();
		System.out.print("Enter zip code : ");
		zip=sc.nextInt();
		sc.close();
	}

}
