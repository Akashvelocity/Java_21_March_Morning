package Interface;

public interface interface1 
{   
	// In an interface we can declare abstract ,public, default and static methods, private methods (From 1.8/1.9 Version Onwards).
	
	//Super Interface

	//Constructor concept in not present inside Interface because:
	//1) Constructor: Constructor name should be same as classname
	//2) Constructor is used to initialize Non static global variables and objects

	
	/*
	 
	interface1()
	{
	
	}
	
	*/
	
	//Object of an Interface can't be created.
	//D.M (data members)/variables declared inside Interface are bydefault "public", "static" and "final".
	
	int a=10; // public static final int a=10;
	
	//Interface is used to declare only incomplete/abstract methods in it (Upto 1.7 Version).
	
	//Methods declared inside Interface are bydefault public & abstract (Upto 1.7 Version).
	
	void m1(); //abstract public void m1();
	void m2(); //abstract public void m2();
	public void m3(); //abstract public void m3();
	abstract void m4(); //abstract public void m4();
	abstract public void m5(); // abstract public void m5();

	//Default method (Version 1.8)
	default void m6()
	{
	    System.out.println("Hi");
	}
	
	//Static method (Version 1.8)
	public static void m7()
	{
	    System.out.println("Hello");
	}
	
	//Private method (Version 1.9)
	private void m8()
	{
	    System.out.println("Good Morning");
	}
	public static void main(String[] args)
	{
		
	}
}
