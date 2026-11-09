package Types_of_Variable;

public class Test5 
{ 
	// Non-Static Global variable call from same class
	int c=30; // Non-Static Global variable
	public static void main(String[] args)
	{
		// Step I: Create object/Instance from same class
		Test5 S1=new Test5();   // classname objectname=new classname();
		// Step II: Call the Variable
		System.out.println(S1.c);  // objectname.variablename;
	}
}
