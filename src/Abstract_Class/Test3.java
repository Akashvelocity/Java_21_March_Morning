package Abstract_Class;

public class Test3 extends Test2
{
	//Child class/sub Class
	
	//Concrete Class : Complete Class
	
	//m1() m2() abstract public void m3(); abstract public void m4();
	
	//Completed Method
	public void m3() //Method declaration
	{
	System.out.println("Method m3() is completed in a concrete class");
	// Method implementation/definition
	}
	
	//Completed Method
	public void m4() //Method declaration
	{
	System.out.println("Method m4() is completed in a concrete class");
	// Method implementation/definition
	}
	
	public static void main(String[] args)
	{
	Test3 T3=new Test3();
	T3.m1();
	T3.m2();
	T3.m3();
	T3.m4();
	}
}
