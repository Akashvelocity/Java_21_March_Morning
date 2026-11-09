package String;

public class Sample9 
{
	public static void main(String[] args)
	{
		
	StringBuffer S3=new StringBuffer("Velocity");
	StringBuffer S4=new StringBuffer("Velocity");
	
	//What is the difference between == and .equals() method?
	//== : Used for reference comparison
	
	System.out.println(S3==S4); //false
	
	//.equals() method: Used for reference comparison
	System.out.println(S3.equals(S4)); //false
	}
}
