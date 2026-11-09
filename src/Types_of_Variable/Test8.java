package Types_of_Variable;

public class Test8 
{
    // Accessing of Static global Variable in methods
	static int a=10; // static/class global variable
	
	public static void main(String[] args)
	{
		System.out.println(a);  // 10
		m1();  // methodname();
		
		// Step I: Create object/instance form same class
		     Test8 S3=new Test8();  // classname S3=new classname();
		     
		     // Step II: call the method
		     S3.m2();  // objecctname.classname();
	}
	
	// Static regular method
	public static void m1()
	{
		System.out.println(a);  //10   // variablename;
	}
	
	// Non Static regular method
	public void m2()
	{
		System.out.println(a);  // 10 // variablename
	}
}
