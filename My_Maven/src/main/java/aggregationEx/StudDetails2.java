package aggregationEx;

import java.util.Scanner;

public class StudDetails2 {
	int rollnum;
	String name2;
	//StudAddress2 address;
	public void getStudentDetails()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter student roll number : ");
		rollnum=sc1.nextInt();
		System.out.print("Enter student name: ");
		name2=sc1.next();
		
		//sc1.close();
	}

	public void display()
	{
		
		//getStudentDetails();
		StudAddress2 address=new StudAddress2();
		address.getAddress();
		System.out.println("\n");
		System.out.println("...Displaying Student details...");
		System.out.println("\nStudent roll number = "+rollnum);
		System.out.println("Student name = "+name2);
		System.out.println("Student city = "+address.city);
		System.out.println("Student country = "+address.country);
		System.out.println("Student zip code = "+address.zip);
		
	}

	public static void main(String[] args) {
		
		StudDetails2 obj1=new StudDetails2();
		obj1.getStudentDetails();
		obj1.display();
		

	}

}
