package String;

public class Sample6 
{
	// Why Strings are immutable in nature?
	//In Java, Strings are immutable, which means once a String object is created, its value cannot be changed.
	
	public static void main(String[] args)
	{
		
	//immutable: Non changeable behavior
		
	String S1=new String("Velocity");
	
	S1.concat("Classes"); //VelocityClasses
	
	System.out.println(S1); //Velocity
	
	}
	
}
