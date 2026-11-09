package Generalization;

public class VI  implements Simcard
{
	//Sub Class: Implementation Class
	
	//void Calling(); //abstract public void Calling();
	//void SMS(); // abstract public void SMS();
	//void Internet(); //abstract public void Internet();
	
	public void Calling()
	{
	  System.out.println("Calling 300 Hrs");
	}
	
	public void SMS()
	{
	  System.out.println("300 SMS");
	}
	
	public void Internet()
	{
	  System.out.println("3GB Internet");
	}
}
