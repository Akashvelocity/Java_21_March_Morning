package Access_Specifiers_modifiers;

public class Test4 
{
   /* c. default:
        If you declare any member of class(Variables,
        Constructors,Methods) as default, then scope of that member remains
         only within the package.
          It can't be accessed from other packages.
        There is no keyword to represent default access specifiers.
         //Member of Class--> Variables, Constructors,Methods
          */
	
	int c=30; //non static global variable
	Test4() //default user defined constructor
	{
	}
	void m3()
	{
	System.out.println("Good Morning");
	}

	public static void main(String[] args)
	{
	Test4 T4=new Test4();
	System.out.println(T4.c); //30
	T4.m3(); //Good Morning
	}
}
