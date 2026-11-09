package Method;

public class Demo3 
{  		
	// Non static regular method call from different class
	public static void main(String[] args)
	{
		// Step_1) Create an object/instance for different class
		Demo4 D4=new Demo4();  // Classname objectname=new classname();
		// step_2) call the method
		D4.m4();   // objectname.methodname()
		D4.m5();     // objectname.methodname()
		D4.m6();    // objectname.methodname()
	}
	
}