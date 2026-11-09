package conditional_statements;

public class Test11 
{ // nested if
	public static void main(String[] args)
	{
		String username="admin";
		String password="admin123";
		
		if(username=="admin")   // admin==admin__>true
		{
			System.out.println("Correct Username");
			
		if(password=="admin123")  // admin123==admin123__>true
		{
			System.out.println("Correct Password...Login Sucessful");
		}
		else
		{
			System.out.println("Incorrect Password..Login failed");
		}
		}
		else
		{
			System.out.println("Incorrect Username");
		}
				
	}

}
