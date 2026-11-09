package Constructor;

public class Test4 
{
	//Step-(1) Variable declaration
	int x; //50 //Non static global variable
	int y;//120 //Non static global variable
	
	String Sname; //Virat //Non static global variable
	
	//Step-(2) Variable initialization/Assignment
	Test4() //User defined constructor
	{
	x=20;
	y=30;
	}
	//50 //120
	Test4(int a, int b) // User defined constructor with parameter constructor
	{
	x=a; //50
	y=b; //120
	}
	
	//Virat
	Test4(String S1) //User defined constructor with parameter constructor
	{
	Sname=S1; //Virat
	}
	
	//Step-(3) Variable Usage
	public void addition()
	{
	int Sum=x+y; //170
	System.out.println(Sum); //170
	}
	
	public void multiplcation()
	{
	int multi=x*y; //6000
	System.out.println(multi); //6000
	}
	
	public void school()
	{
	System.out.println(Sname);//Virat
	}
}
