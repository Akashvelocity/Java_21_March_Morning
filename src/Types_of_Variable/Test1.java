package Types_of_Variable;

public class Test1 
{
	// Local Variable
		// Scope: only Within method where is declared
	   public static void m1(int c)
	   {
		   int a=10;   // Local Variable
		   System.out.println(a);  //10
		   int b=20;  // Local Variable
		   System.out.println(b);
		   int Sum=a+b+c; // 60     // Local variable
		   System.out.println(Sum);  // 60
	   }
	   public static void main(String[] args)
	   {
		   m1(30);   // methodname();
	   }

}
