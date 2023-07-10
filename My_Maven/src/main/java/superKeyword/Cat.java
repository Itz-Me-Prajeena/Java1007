package superKeyword;

public class Cat extends Animal {
	String color="Brown";
	public void display()
	{
		super.display();
		System.out.println("Cats color is "+color);
		
	}
	public static void main(String args[])
	{
		Cat obj=new Cat();
		obj.display();
		
	}

}
