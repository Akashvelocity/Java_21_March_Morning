package Access_Specifiers_modifiers;

public class Test5 
{
	public static void main(String[] args)
	{
	Test4 T5=new Test4();
	System.out.println(T5.c);//30
	T5.m3(); //Good Morning
	
	Test6 T7=new Test6();
	System.out.println(T7.Sname);
	
	T7.m4();
	}
}

