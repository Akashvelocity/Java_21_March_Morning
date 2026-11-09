package String;

public class Sample5 
{
	public static void main(String[] args)
	{
		
	String S1="velocity";
	String S2="";
	String S3="ABCD";
	String S4="VELOCITY";
	String S5="velocity";
	String S6="Banana";
	String S7="city";
	String S8="Manual classes";
	String S9="Only";
	String S10=" Automation";
	String S11=" Classes";
	String S12=" Java ";

	//To get length/Size/Capacity
	System.out.println(S1.length());//8
	
	//To verify S1 is empty or not
	System.out.println(S1.isEmpty()); //false

	//To verify S2 is empty or not
	System.out.println(S2.isEmpty());//true
	
	// To convert to Uppercase
	System.out.println(S1.toUpperCase()); //VELOCITY
	
	// To convert to lowercase
	System.out.println(S3.toLowerCase()); //abcd
	
	//To compare S1 and S4
	System.out.println(S1.equals(S4)); //velocity //VELOCITY //false

	//To compare S1 and S5
	System.out.println(S1.equals(S5)); //velocity //velocity //true

	//To compare S1 and S4
	System.out.println(S1.equalsIgnoreCase(S4));//velocity VELOCITY true

	//To get single character
	System.out.println(S1.charAt(0));//v
	System.out.println(S1.charAt(4)); //c
	
	//To get index by providing character
	System.out.println(S1.indexOf('i'));//5
	
	//To verify String S1 starts with "vel"
	System.out.println(S1.startsWith("veloc")); //true
	
	//To verify String S1 ends with "city"
	System.out.println(S1.endsWith("city")); //true
	
	//To get last index of character
	System.out.println(S6.lastIndexOf('a')); //5
	System.out.println(S6.lastIndexOf('n')); //4
	
	// Compare S1 and S7 by using contains() method
	System.out.println(S1.contains(S7)); //velocity city //true

	//To get substring
	System.out.println(S1.substring(4)); //city
	//To get substring

	System.out.println(S1.substring(2,7)); //starting index-->included
	//end index-->excluded // locit

	// To replace "Manual" with "Automation"
	System.out.println(S8.replace("Manual", "Automation")); //Automation classes
	

	// To concat()
	System.out.println(S9.concat(S10)); //Only Automation
	System.out.println(S9.concat(S10+S11)); //Only Automation Classes
	
	//To remove spaces from left and right of given String
	System.out.println(S12); //" Java "
	System.out.println(S12.trim()); //Java
	}
}
