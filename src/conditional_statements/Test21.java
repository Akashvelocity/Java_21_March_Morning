package conditional_statements;

public class Test21 
{
  // conditional/ternary operator
	public static void main(String[] args)
	{
		int age=14;
		               // 14>=18__>false
		String output=(age>=18) ? "You are eligible for vote" : "You are not eligible for vote";
		System.out.println(output);  // You are not eligible for vote
	}
}
