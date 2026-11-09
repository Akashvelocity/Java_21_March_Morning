package Access_Specifiers_modifiers;

public class Test6
{
      
	/* 
	 //Super Class
	 
	//d. protected:
	// If you declare any member of class(Variables,
	Constructors,Methods) as protected, then scope of that member
	remains within the package, but by using inheritance, we can access
	member of classes which is present in the different packages
	//Member of Class--> Variables, Constructors,Methods
	/// 
	 */

	protected String Sname="Virat";   // non static global variable
	
	public Test6()
	{
		
	}
	
	protected void m4()
	{
		System.out.println("Good Afternoon");
	}

	
	public static void main(String[] args)
	{
		Test6 T6=new Test6();
		System.out.println(T6.Sname);
		T6.m4();
	}
}
