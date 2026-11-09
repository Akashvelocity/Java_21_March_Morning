package Loops;

public class Demo11 
{
	// Print both even and odd number from 1 to 10__>1 2 3 4 5 6 7 8 9 10
	public static void main(String[] args)
	{
		 //     i=1  1<=10  i=2
		//           2<=10  i=3
		//           3<=10  i=4
		//           4<=10  i=5
		//           5<=10  i=6
		//           6<=10  i=7
		//           7<=10  i=8
		//           8<=10  i=9
		//           9<=10  i=10
		//           10<=10 i=11
		//           11<=11
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+": is even number"); // 2 4 6 8 10
			}
			else
			{
				System.out.println(i+":is odd number"); // 1 3 5 7 9
			}
		}
	}

}
