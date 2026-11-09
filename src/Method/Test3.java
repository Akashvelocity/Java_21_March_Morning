package Method;

public class Test3 
{
	// Static regular method  call from different class
	public static void main(String[] args)
	{
		Test4.m5();    // classname.methodname();
		Test4.m4();    // classname.methodname();
		Test4.m5();    // classname.methodname();
	}

}
