package this_and_super_keyword;

public class Sample1 extends Sample2
{
	//Child Class/Sub class
	//int a=40;
	int a=20;
	int b=30;
	public void m1()
	{
	int a=10; //Local Variable
	System.out.println(a); //10
	System.out.println(a); //10
	System.out.println(this.a); //20 //this.variablename
	System.out.println(b); //30
	System.out.println(this.b); //30
	System.out.println(this.a);//20
	System.out.println(super.a); //40 //super.variable
	}
	public static void main(String[] args)
	{
	Sample1 S1=new Sample1();
	S1.m1();

	}
}
