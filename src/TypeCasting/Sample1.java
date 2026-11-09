package TypeCasting;

public class Sample1 
{
	public static void main(String[] args)
	{
		
	//Create object of Son Class
	Son S1=new Son();
	S1.Mobile();
	S1.Car();
	S1.Money();
	S1.Home();

	System.out.println("======================================");
	//Upcasting : Create Object of Sub Class and provide reference of Super Class
	

	//Runtime Polymorphism
	Father S2=new Son();
	S2.Car(); //Kia Seltos
	S2.Home(); //2 BHK
	S2.Money(); //5 Lakhs

	}
}
