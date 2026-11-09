package conditional_statements;

public class Test9 
{
	public static void main(String[] args)
	{
		int marks=35;
		
		if(marks>=65)   //1) 35>65 OR  2)35=65__>false
		{
			System.out.println("Distinction");
		}
		else if(marks>=60)   //1) 35>65  OR 2) 35=65__>false
		{
			System.out.println("First class");
		}
		else if(marks>=55)   // 1) 35>55  OR 35=55__>false
		{
			System.out.println("Higher Seond class");
		}
		else if(marks>=50) // 35>50 OR 35=50__>false
		{
			System.out.println("Second class");
		}
		else if (marks>=35)   // 35>35 OR 35=35__>true
		{
			System.out.println("Passed");
		}
		else 
		{
			System.out.println("Failed");
		}
		
	}
	

}
