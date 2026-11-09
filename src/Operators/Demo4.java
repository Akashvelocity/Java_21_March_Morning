package Operators;

public class Demo4 
{
	public static void main(String[] args)
	{
		// (2) Relational/Comparison Operators: >,>=,<,<=,!=,==
		//  Relational/Comparison Operators return boolean value output__>false/ture
		int a=50;
		int b=10;
		System.out.println(a>b);   //50>10__>True
		System.out.println(a<b);   // 50<10__> False
		System.out.println(a>=b);  // (1) 50>10__>True OR  (2) 50=10__>false__>True
		System.out.println(a<=b);  // (1) 50<10__> False OR (2) 50=10__>false__>false
		System.out.println(a!=b);  //  50!=10__> True
		System.out.println(a==b);  // 50==10__> false
		int c=50;
		int d=50;
		System.out.println(c>=d);    //(1) 50>50__>false OR (2) 50=50__> True__> True
		System.out.println(c<=d);   // (1) 50<50__> false OR (2) 50=50__> True__>True
		System.out.println(c!=d);   // 50!=50__>false
		System.out.println(c==d);   // 50==50__> True
	}

}
