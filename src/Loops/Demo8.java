package Loops;

public class Demo8 
{
	// for loop 
	// Print even nos from 1 to 10__> 2 4 6 8 10
	public static void main(String[] args)
	{
		//      i=2  2<=10  i=4
	    //      i=4  4<=10  i=6
		//      i=6  6<=10  i=8
		//      i=8  8<=10  i=10
		//      i=10 10<=10 i=12
		//      i=12 12<=10
		for(int i=2; i<=10; i=i+2)
			{
			System.out.println(i);
			}
	}

}
