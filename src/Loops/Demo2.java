package Loops;

public class Demo2 
{
       // Print 25 to 28 Nos by using for loop___>25 26 27 28
	public static void main(String[] args)
	{        // i=25   25<=28    i=26
		//             26<=28    i=27
		//             27<=28    i=28
		//             28<=28    i=29
		           //  29<=28
		for(int i=25;  i<=28;   i=i+1)
		{
			System.out.println(i);
		}
	}
}
