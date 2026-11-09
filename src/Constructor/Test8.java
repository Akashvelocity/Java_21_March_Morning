package Constructor;

public class Test8
{
	// Calling of one constructor into another Constructor
    
	Test8()
	{
		this(10);
	}
	
	Test8(int a)
	{  this("Virat");
		System.out.println(a);
		System.out.println("Hi");
	}
	Test8(String Sname)
	{
		System.out.println(Sname);
	}
	
	public static void main(String[] args)
	{
		Test8 T8=new Test8();
				
	}
}
