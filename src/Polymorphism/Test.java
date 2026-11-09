package Polymorphism;

public class Test 
{
	public static void main(String[] args)
	{
	Son S1=new Son(); // Bike() Car() Money() Home()
	S1.Bike(); //Unicorn
	S1.Car(); //Kia Seltos
	S1.Money(); //5 Lakh
	S1.Home(); //3 BHK
	
	System.out.println("========================");
	
	Father F1=new Father(); //Car() Money() Home()
	F1.Car(); //Honda City
	F1.Home(); //2 BHK
	F1.Money(); //10 Lakh
	}
}
