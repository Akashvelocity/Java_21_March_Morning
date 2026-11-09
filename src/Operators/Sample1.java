package Operators;

import Access_Specifiers_modifiers.Test1;
import Access_Specifiers_modifiers.Test4;
import Access_Specifiers_modifiers.Test6;

public class Sample1 extends Test6
{
	
	//Sub Class
	//Sname main()
	
	public static void main(String[] args)
	{
   Test1 T3=new Test1();
   System.out.println(T3.a);
   T3.m1();
   
   Sample1 S1=new Sample1();
   System.out.println(S1.Sname); // virat
   
	}
}
