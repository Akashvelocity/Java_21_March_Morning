package Access_Specifiers_modifiers;

public class Test1
{
    // Access Specifiers are used to  represent scope of member of class ( Methods, Variables, constructors)
	// a. public : If you declare any member of class ( Methods, Variables, constructors) as scope of that member remains throught the project.
	// member of class :  Methods, Variables, constructors 
	
	public int a=15; // non static global variable
	
	 public Test1()
	{
		
	}
	
	public void m1()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args)
	{
		Test1 T1=new Test1();
		System.out.println(T1.a);
		T1.m1();
		
	}
}
