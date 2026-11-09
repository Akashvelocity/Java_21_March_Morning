package Inheritance;

public class Test 
{
	public static void main(String[] args)
	{
	Son1 S1=new Son1();
	S1.Mobile();
	S1.Car();
	S1.Home();
	S1.Money();
	
	System.out.println("--------------------------------");
	
	Son2 S2=new Son2();
	S2.Laptop();
	S2.Car();
	S2.Home();
	S2.Money();
	
	System.out.println("--------------------------------");
	
	Son3 S3=new Son3();
	S3.Bike();
	S3.Car();
	S3.Home();
	S3.Money();
	}
}
