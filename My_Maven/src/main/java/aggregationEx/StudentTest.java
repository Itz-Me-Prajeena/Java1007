package aggregationEx;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Scanner object for taking input from console
	    Scanner sc = new Scanner(System.in);

	    // Taking input for student details
	    System.out.println("Enter student roll number:");
	    int rollnum = sc.nextInt();
	    System.out.println("Enter student name:");
	    String name = sc.next();
	    
	 // Taking input for student address details
	    System.out.println("Enter student address (city,country,zip):");
	    String city = sc.next();
	    String country = sc.next();
	    int zip=sc.nextInt();
	    
	 // Closing the scanner
	    sc.close();

	    // Creating an Address object
	    StudAddress s = new StudAddress(city,country,zip);
	   
	    // Creating a Student object with aggregation
	    StudentDetails student = new StudentDetails(rollnum,name,s);
	    
	    // Displaying the student details
	    student.display();

	    
	   
	  }
	}