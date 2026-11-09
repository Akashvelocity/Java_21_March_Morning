package Operators;

public class Demo5 
{
  // i) Logical operators return in boolean output
	// ii) && (AND): Both value should be "true" then and only then only output become "true".
	// iii) || (OR): At least one value should be "true" then and only then output become "true".
	 // iv) ! (NOT): Provides output which is Exactly opposite of given input.
	public static void main(String[] args)
	{
		int a=50;
		int b=60;
		int c=900;
		int d=1000;
		System.out.println(a>b && a<b);  // 50>60_>false && 50<60_>true__>false
		System.out.println(c>a && d>b);  // 900>50_>true && 1000>60_>true__>true
		System.out.println(a>d && d<b);  // 50>1000_>false && 1000<60_>false__>false
		System.out.println(a>b || a<b);  // 60_>false||50<60_>true_>true
		System.out.println(c>a || d>b);  // 900>50_>tru ||1000>_>true__>true
		System.out.println(a>d || d<b);  //  50>1000_>false||1000_>false__>false
		System.out.println(!(a>b));  // 50>60_>false___>true
		System.out.println(!(a<b));  // 50<60_>true___>false
	}
}
