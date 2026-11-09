package Constructor;

public class Test7 
{
    // Difference between Constructor And Method
	Test7()
	{
		System.out.println("Hi");
	}
	public void main(String[] args)
	{
		Test7 T7=new Test7();
		T7.m1();
	}
	public void m1()
	{
		System.out.println("Good Morning");
	}
}
