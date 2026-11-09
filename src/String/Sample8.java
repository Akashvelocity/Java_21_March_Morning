package String;

public class Sample8 
{
   // What is the difference between == and .equals() method?
	
	public static void main(String[] args)
	{
		
	String S1=new String("Velocity");
	
	String S2=new String("Velocity");
	
	//What is the difference between == and .equals() method?
	
	//== : Used for reference comparison
	
	System.out.println(S1==S2); //false
	
	//.equals() method: Content Compare
	System.out.println(S1.equals(S2)); //Velocity Velocity //true
	}
}
