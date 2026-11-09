package Types_of_Variable;

public class Test9 
{
	// Accessing of Non-Static global Variable in methods
	
	int b=20; // Non Static global variable
	
	public static void main(String[] args)
	{
		// Step I: create object/instance from same class
		Test9 S4= new Test9();// classname objectname=new classname();
		
		// Step II: call the variable
		System.out.println(S4.b); // 20 //Objectname.variablename;
		
	}
	// Static Regular Method
	public static void m1()
	{
	// Step I: Create object of same class
		  Test9 S5=new Test9(); // classname objectname=new classname();
		  
		 // Step II: call the variable 
		          System.out.println(S5.b); // 20 //Objectname.variablename;    
	}
	
	// Non static regular method 
	public void m2()
	{
		System.out.println(b);  // variablename;
	}
}
