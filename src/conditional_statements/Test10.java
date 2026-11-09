package conditional_statements;

public class Test10 
{
	// nested if
	public static void main(String[] args)
	{
		String username="admin";
		String  password="admin123";
		if(username=="admin")    // admin==admin__>true
		{
			System.out.println("Correct Username");
			if(password=="admin123")    // admin123==admin123
			{
				System.out.println("Correct Password__Login Sucessful");
			}
			else 
			{
				System.out.println("Password Incorret");
			}
		}
		else 
		{
			System.out.println("Username Incorrect");
		}
	}

}
