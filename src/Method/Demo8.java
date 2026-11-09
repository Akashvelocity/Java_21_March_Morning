package Method;

public class Demo8 
{
  public static void main(String[] args)
  {
	  // Static Regular method
	  addition();            // methodname();
	  addition();           // methodname();
	  addition(20,50);     // methodname();
	  addition(100,200);   // methodname();
	  addition(5,90);     // methodname();
	  
	  // Non Static Regular method
	  // Step 1) create an object/instane for same class
	  Demo8 S1=new Demo8();    // classname object=new classname();
	  // Step 2) call the object
	      S1.Multiplication(10,20, 30);          // objectname.classname();
  }
  // Static Regular Method__> zero/Without parameter method
        public static void addition()
        {
            int a=10;
        int b=20;
        int Sum1=a+b;    //30
        System.out.println(Sum1);
        }
        //Static Regular Method_>With parameter method(2 int parameter method)
        public static void addition(int c, int d)
        {
        	int Sum2=c+d;
        	System.out.println(Sum2);
        }
        // Non static Regular method__> with parameter method
        public void Multiplication(int x, int y, int z)
        {
        	int Multi1=x*y*z;
        	System.out.println(Multi1);
        }
        
}
