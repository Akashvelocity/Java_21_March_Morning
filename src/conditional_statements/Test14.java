package conditional_statements;

public class Test14 
{
	public static void main(String[] args)
	{
		String Browser="chrome";
		switch(Browser)  // chrome
		{
		case "Opera" : System.out.println("We are opening an Opera Browser");break;// opera=chrome__>false
		case "Firebox" : System.out.println("We are opening an Firebox Browser");break; // firebox=chrome__> false
		case "Chrome" : System.out.println("We are opening an Chrome Browser");break; // chrome=chrome
		case "Safari" : System.out.println("We are opening an Safari Browser");break; 
		default : System.out.print("We are opening an Edge Browser");
		}
	}

}
