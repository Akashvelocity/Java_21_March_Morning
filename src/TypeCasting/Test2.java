package TypeCasting;

public class Test2
{
	//1) Implicit Casting/Widening Casting(Automatically-By default)

	public static void main(String[] args)
	{
		
	//Example-1: char to int
	char x='A'; // 2 bytes
	System.out.println(x); //A
	
	int y = x; //A=65 //4 bytes
	System.out.println(y); //65
	

	//Example-2: char to int
	char a='d'; // 2 bytes
	System.out.println(a); //d
	
	int Z = a; //a=100 //4 bytes
	System.out.println(Z); //100
	}
	
}
