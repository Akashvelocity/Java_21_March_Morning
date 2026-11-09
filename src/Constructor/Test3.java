package Constructor;

public class Test3 
{
  // constructor:- Constructor name should be same as classname;
	// use: Constructor is used to initialize object and non static global variable
	// Step I: Variable Declaration
	int a; // 10 // Non Static Global variable
	int b; // 20 // Non Static Global variable
	
	// Step II: Variable Initialization/ assignment
	Test3()     // User Defined Constructor
	{
		a=10;
		b=20;
	}
	// non Static regular method
	public void addition()
	{
		int Sum=a+b;
		System.out.println(Sum);  //30
	}
	
	public static void main(String[] args)
	{
		//create object of same class
		Test3 T3=new Test3();
		// Call the method
		T3.addition();
	}
	
}
