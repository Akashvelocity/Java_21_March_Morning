package conditional_statements;

public class Test20 
{
     // conditional/ternary operator
	public static void main(String[] agrs)
	{
		int age=24;
		            // 24>=18__>true
		String output=(age>=18) ? "You are eligible for vote": "You are not eligible for vote";
		System.out.println(output);  // You are eligible for vote
	}
}
