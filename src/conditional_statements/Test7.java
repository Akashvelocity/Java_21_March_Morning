package conditional_statements;

public class Test7 
{
// else if 
	public static void main(String[] args)
	{
		int marks=35;
		if(marks>=90)
		{
			System.out.println("merit");
		}
		else if (marks>=80)
		{
			System.out.println("1st class");
		}
		else if(marks>=70)
		{
			System.out.println("2nd class");
		}
		else if(marks>60)
		{
			System.out.println("3rd class");
		}
		else if (marks>35)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
