package Generalization;

public class JIO implements Simcard
{
	//Sub Class : Implementation Class
	
	//void Calling(); //abstract public void Calling();
	
	//void SMS(); // abstract public void SMS();
	
	//void Internet(); //abstract public void Internet();
	

	public void Calling()
	{
	   System.out.println("Calling 100 Hrs");
	}
	
	public void SMS()
	{
	   System.out.println("100 SMS");
	}

	public void Internet()
	{
	   System.out.println("2 GB Internet");
	}
	
	public void InternationalCalling()
	{
	   System.out.println("International Calling");
	}
}
