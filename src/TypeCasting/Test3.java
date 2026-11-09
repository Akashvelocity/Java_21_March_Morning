package TypeCasting;

public class Test3 
{
	//1) Implicit Casting/Widening Casting(Automatically -By default)
	

	public static void main(String[] args)
	{
		
	//Example-1: float to double
	float price = 99.99f; //4 bytes
	System.out.println(price); //99.99
	
	double d=price; //99.98999786376953 //8 byte
	System.out.println(d); //99.98999786376953
	
	
	//Example-2: byte to int
	byte b=100; //1 byte
	System.out.println(b); //100

	int i=b; //100 //4 byte
	System.out.println(i);//100
	}
}
