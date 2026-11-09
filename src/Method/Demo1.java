package Method;

public class Demo1 
{
	// Non Static method call from same class
	public static void main(String[] args)
	{
		System.out.println("Hi");
		// Step_1) Create object/instance from same class
		  Demo1 D1=new Demo1(); // classname object=new classname();
		// Step_2) Call the method
		D1.m1();
	}
	// Npn Static method
	public void m1()
	{
		System.out.println("Non Static method m1() is running from same class");
	}
	}
