package Loops;

public class Demo7 
{
  // for loop
	// Print 2 to 5 nos by using for loop
	public static void main(String[] args)
	{
		 //     i=5  5>=2   i=4
		 //          4>=2   i=3
		 //          3>=2   i=2
		 //          2>=2   i=1
		 //          1>=1  
		for(int i=5; i>=2; i-=1)   // i-=1 i--
			{
			System.out.println(i);
			}
	}
}
