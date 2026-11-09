package Generalization;

public class AIRTEL implements Simcard
{
	//Sub Class :Implementation Class
	
	//void Calling(); //abstract public void Calling();
	//void SMS(); // abstract public void SMS();
	//void Internet(); //abstract public void Internet();
	
	public void Calling()
	{
	  System.out.println("Calling 200 Hrs");
	}
	
	public void SMS()
	{
	  System.out.println("200 SMS");
	}
	
	 public void Internet()
	{
	  System.out.println("1.5 GB");
	}

	public void PerplexcityAI()
	{
	   System.out.println("Perplexcity AI");
	}
}
