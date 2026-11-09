package Types_of_Variable;

public class Test6 
{
	// Non static global Variable call from Different class
	public static void main(String[] args)
	{
	//Step-I: Create an Object of Different class
	Test7 S2=new Test7(); //Classname Objectname=new Classname();
	
	//Step-II: Call the Variable
	System.out.println(S2.d); //40 //Objectname.Variablename;
	
	}
}
