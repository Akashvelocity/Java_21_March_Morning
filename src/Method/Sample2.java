package Method;

public class Sample2 
{
    // 1) Static regular method call from same class
	public static void main(String[] args)
	{
		System.out.println("Hi");
		m1();   // methodname();
		m1();   // methodname();
		m2();   // methodname();
		
		
	}
	// static regular method
	public static void m1()
	{
		System.out.println("Static regular method m1() running from same class");
	}
	// static regular method
	public static void m2()
	{
		System.out.println("Static regular method m2() running from same class");
	}
}
