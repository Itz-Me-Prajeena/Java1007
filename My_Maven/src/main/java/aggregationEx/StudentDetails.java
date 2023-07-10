/*Write a program to get the details of a Student 
 Class 1 - Student Get the student name and roll number 
 Class 2- Address Get the address of student Print Student name, roll number with address 
 There is no IS-A relationship */

package aggregationEx;


public class StudentDetails {
	int rollnum;
	String name;
	StudAddress s;
	
	public StudentDetails(int rollnum, String name, StudAddress s) 
	{
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.s = s;
	}
	
	public void display()
	{
		System.out.println("Student roll number: "+rollnum);
		System.out.println("Student name: = "+name);
		System.out.println("Student city = "+s.city);
		System.out.println("Student country = "+s.country);
		System.out.println("Student zip = "+s.zip);
		
	}
	

}
