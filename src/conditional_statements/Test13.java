package conditional_statements;

public class Test13 
{ // Switch condition
	public static void main(String[] args)
	{
		String day="viraj";
		
		switch(day) // viraj
		{
		case "mon" : System.out.println("Monday"); break;  // mon-viraj__>false
		case "tue" : System.out.println("Tuesday"); break; //tue-viraj__>false
		case "wed" : System.out.println("Wednesday"); break; //wed-viraj__>false
		case "thur" : System.out.println("Thuresday"); break; // thur-viraj__>false
		case "fri"  : System.out.println("Friday"); break; // fri-viraj__>false
		case "sat"  : System.out.println("Saturday"); break; // sat-viraj__>false
		case "sun" : System.out.println("Sunday"); break; // sun-viraj__>false
		default : System.out.println("Invalid Input ");
		}
	}

}
