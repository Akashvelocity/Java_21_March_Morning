package Method;

public class Demo7 
{
	public static void main(String[] args)
	{
		addition();    // methodname();
		addition();
		addition(20,50);
	}
	// Static Regular method__> zero/Without parameter method
	public static void addition()
	{
		int a=10;
		int b =20;
		int sum1=a+b;  // 30
		System.out.println(sum1);  //30
	}
	// Static Regular method __> with parameter
	public static void addition(int c,int d)
	{ 
		int sum2=c+d;
		System.out.println(sum2);
	}
}
