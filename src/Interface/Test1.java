package Interface;

public class Test1 implements interface1
{

	//implementation Class : Complete class
	
	//Sub Class
	
	//void m1(); void m2(); public void m3(); abstract void m4(); abstract public void m5(); public static final int a=10;
	
	public void m1() // Method declaration
	{
	    System.out.println("Method m1() is completed in implementation Class");  //method definition/implementation
	}

	public void m2() // Method declaration
	{
	     System.out.println("Method m2() is completed in implementation Class"); //method definition/implementation
	}

	public void m3() // Method declaration
	{
	  System.out.println("Method m3() is completed in implementation Class"); //method definition/implementation
	}

	public void m4() // Method declaration
	{
	   System.out.println("Method m4() is completed in implementation Class"); //method definition/implementation
	}

	public void m5() // Method declaration
	{
	System.out.println("Method m5() is completed in implementation Class"); //method definition/implementation
	}

	public static void main(String[] args)
	{
	Test1 T1=new Test1();
	T1.m1();
	T1.m2();
	T1.m3();
	T1.m4();
	T1.m5();
	System.out.println(a);

	}
}
