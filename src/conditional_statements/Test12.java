package conditional_statements;

public class Test12 
{
	// Switch Condition
	public static void main(String[] args)
	{
		String day="sat";
		switch(day)  // sat
		{
		case "mon": System.out.println("Monday"); break;  // mon-sat__>false
		case "tue" : System.out.println("Tuesday"); break; // tue-sat__>false
		case "wed" : System.out.println("Wed"); break;     // wed-sat__>false
		case "thur" : System.out.println("Thursday"); break; // thur-sat__>false
		case "fri" : System.out.println("Friday"); break;  // fri-sat__>false
		case "sat" : System.out.println("Saturday"); break;  // sat-sat__>true
		case "sun" : System.out.println("Sunday");  break;
		default : System.out.println("Invalid Input");
		}
	}

}
