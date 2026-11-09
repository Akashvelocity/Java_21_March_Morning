package Access_Specifiers_modifiers;

public class Test3
{
  // b. private
	
	// - If you declare any member of class(variables, constructors, methods) as private, then scope of that member remains only within the class.
	
	// it can't be accessed from other class.
	
	// member of class: Variable, Constructor, Method.
	
	//Singleton class: If the class has private constructor then that class is known as Singleton class.
	
	private int b=20;  // non static global variable
	Test3()
	{
		
	}
	private void m2()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		Test3 T3=new Test3();
		System.out.println(T3.b);
		T3.m2();
	}
	
}
