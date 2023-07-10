package superKeyword;

public class Dog extends Animal {
	String color="black";
	public Dog()
	{
		super(); //Calling Parent class constructor
		System.out.println("Invoking Dog Costructor");
	}
	void printColor()
	{  
		System.out.println("Prints color of Dog class : "+color);//prints color of Dog class  
		System.out.println("Prints color of Animal class : "+super.color);//prints color of Animal class  
	} 
	public void display()
	{
		super.display();
		System.out.println("Dog class method - Dog's color is "+color);
		
	}
public static void main(String args[])
{
	Dog obj=new Dog();
	obj.printColor();
	obj.display();
}
}
