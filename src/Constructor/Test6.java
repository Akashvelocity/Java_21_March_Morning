package Constructor;

public class Test6 
{
    // When an object of a class is created, Then constructor is called/executed automatically.
	
	Test6()
	{
		System.out.println("Today is Wednesday");
	}
	
	public static void main(String[] args)
	{
		// Create object of same class
		 Test6 T6=new Test6();  // classname objectname=new classname();
	}
	
	//Non Static regular method
	public void greeting()
	{
		System.out.println("Hi..Good Morning");
	}
	
}

