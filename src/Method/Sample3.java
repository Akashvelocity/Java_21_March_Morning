package Method;

public class Sample3 
{
  // Static regular method call from same class
	public static void m3()
	{
		System.out.println("Static regular method m3()  is running form same class");
	}
	public static void main(String[] args)
	{
	   System.out.println("Hi");
	   m1();   // maethodname();
	   m1();   // maethodname();
	   m2();   // maethodname();
		m3();   // maethodname();
	}
	// Static regular method 
	public static void m1()
	{
		System.out.println("Static regular method m1() is running from same class");
	}
	// Static regular method 
		public static void m2()
		{
			System.out.println("Static regular method m2() is running from same class");
		}
}
