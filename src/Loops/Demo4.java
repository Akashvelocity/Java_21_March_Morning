package Loops;

public class Demo4 
{
  // for loop
	// Print 51 to 54 nos by using for loop__> 51 52 53 54 
	public static void main(String[] args)
	{
		     // i=51  51<=54  i=52
		           // 52<=54  i=53
		          //  53<=54  i=54
		          //  54<=54  i=55
		          //  55<=54  
		for(int i=51; i<=54; i+=1)  // i++ i+=1 i=i+1
			{
			System.out.println(i);
			}
	}
	
}
