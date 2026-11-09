package Polymorphism;

public class Demo2 
{
	//Compiler
	//Compile time Polymorphism : method overloading
	public void m1() //Method Declaration
	{
	System.out.println("Good Morning");//Method Definition/Implementation
	}
	public void m1(boolean Z) //Method Declaration
	{
	System.out.println("21 March FSST"); //Method Definition/Implementation
	}

	public void m1(String Sname) //Method Declaration
	{
	System.out.println("Good Afternoon"); //Method Definition/Implementation
	}
	public void m1(int a) //Method Declaration
	{
	System.out.println("Good Evening"); //Method Definition/Implementation
	}
	public void m1(int x, float y) //Method Declaration
	{
	System.out.println("Hi..Hello"); //Method Definition/Implementation
	}
	public static void m1(float a,float b,String Studentname) //Method Declaration
	
	{
	System.out.println("Velocity 2026"); //Method Definition/Implementation
	}

	public static void m1(double x) //Method Declaration
	{
	System.out.println("Velocity 22-05-2026"); //Method Definition/Implementation
	
	}
}
