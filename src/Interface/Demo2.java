package Interface;

public class Demo2 implements Demo1
{
	//Sub Class
	
	//void m1(); // abstract public void m1();
	//void m2(); // abstract public void m2();
	
	//void m1(); // abstract public void m1();
	//void m2(); // abstract public void m2();
	public void m1()
	{
	    System.out.println("hi");
	}
	
	public void m2()
	{
	   System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
	   Demo2 D2=new Demo2();
	         D2.m1();
	         D2.m2();
	}
}
