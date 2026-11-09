package TypeCasting;

public class Test5 
{
	//Type Casting : Process of converting one data type into another datatype
	
	//1) Explicit Casting/Narrowing Casting/Downcasting (Manually)
	
	public static void main(String[] args)
	{
		
	//Example-1: long to int
	long d = 50000435438998432l; //8 byte
	System.out.println(d);
	
	int a=(int)d; //(int)50000435438998432
	System.out.println(a); //-1863003232
	
	
	//Example-2: double to float
	double g=225.68634566345; //8 byte
	System.out.println(g);
	
	float h=(float)g; //(float)225.68634566345
	System.out.println(h); //225.68634
	
	
	//Example-3: double to int
	double X=123.564653756765;
	System.out.println(X);
	
	int K=(int)X; //(int)123.564653756765
	System.out.println(K); //123
	}
}
