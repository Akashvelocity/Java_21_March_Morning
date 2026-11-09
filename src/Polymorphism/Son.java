package Polymorphism;

public class Son extends Father
{
	//Method overriding is an example of Runtime Polymorphism
	//Sub Class
	//Car() Money() Home()
	
	public void Bike() //Method Declaration
	{
	System.out.println("Unicorn"); //Method Definition/Implmentation
	}
	
	//Method Overriding
	public void Car() //Method Declaration
	{
	System.out.println("Kia Seltos"); //Method Definition/Implmentation
	}

	//Method Overriding
	public void Money() //Method Declaration
	{
	System.out.println("5 Lakh"); //Method Definition/Implmentation
	}
	
	//Method Overriding
	public void Home() //Method Declaration
	{
	System.out.println("3 BHK"); //Method Definition/Implmentation

	}
}
