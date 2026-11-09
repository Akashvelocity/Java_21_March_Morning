package Main_Method_Postmartum;

public class Test1 
{
	public static int m1(int a,int b)
	{
		
	int Sum=a+b; //80
	return Sum; //80
	
	}
	
	public String m2(String Sname) //Virat
	{
		
	return Sname; //Virat
	
	}
	
	public static void main(String[] args)
	{
		
	int add=m1(10,20); //30
	System.out.println(add);//30
	
	int Sum1=m1(30,50); //80
	System.out.println(Sum1);//80
	
	Test1 T1=new Test1();
	String Studentname=T1.m2("Virat"); //Virat
	System.out.println(Studentname); //Virat
	
	}
}
