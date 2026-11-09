package Method;

public class Demo5 
{
	public static void main(String[] args)
	{
	// Static regular method call form same class
	  m10();   // methodname();
	//Non Static regular method call from same class
	// Step_1) Create An object/Instance for same class
	    Demo5 D5=new Demo5();  // classname objectname=new classname();
	//Step_2) call the method 
	    D5.m11();      // objectname.methodname
	// Static regular method call different class
	        Demo6.m12();   // classname.methodname();
	// Non Static method call from different class
	//Step-I: Create an a object for different class
        Demo6 D6=new Demo6();	// classname objectname=new classname();
	// Step-II: call the method
        D6.m13();
	}
	// static regular  method
	public static void m10()
	{
		System.out.println("m10() is running from same class");
	}
	// non Static regular method
	public void m11()
	{
		System.out.println("m11() is running from same class");
	}
}
