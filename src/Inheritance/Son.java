package Inheritance;

public class Son extends Father
{
    // Child class/Sub class
	
	public void Mobile()
	{
		System.out.println("Samsung 24 Ultra");
	}
	// Car // Home // Money
	
	public static void main(String[] args)
	{
		Son S1=new Son();
		S1.Mobile();
		S1.Car();
		S1.Home();
		S1.Money();
	}
}
