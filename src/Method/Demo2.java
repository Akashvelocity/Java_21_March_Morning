package Method;

public class Demo2 
{ 
	// Non Static Regular method call from same class
	public static void main(String[] args)
	{
		// Step_1) Create a object/Instane for same class
		  Demo2 D2=new Demo2();   // classname objectname=new classname
		// Step_2) call the method
		    D2.m1();    // objectname.method();
		    D2.m2();     // objectname.method();
	        D2.m3();	// objectname.method();
	}
	// Non Static regular method 
	public void m1()
	{
		System.out.println("Non Static Regular method m1() is running from same class");
	}
	// Non Static regular method 
	public void m2()
	{
		System.out.println("Non Static Regular method m2() is running from same class");
	}
	// Non Static regular method 
	public void m3()
	{
		System.out.println("Non Static Regular method m3() is running from same class");
	}
	
}
