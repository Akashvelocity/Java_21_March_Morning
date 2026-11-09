package Constructor;

public class Test5 
{
   public static void main(String[] args)
   {
	 //Create object of different class

	   Test4 T5=new Test4(); //Classname objectname=new Classname();
	   T5.addition(); //50

	   //Create object of different class
	   Test4 T6=new Test4(40,100); //Classname objectname=new Classname();
	   T6.addition(); //140
	   
	   //Create object of different class
	   Test4 T7=new Test4(50,120); //Classname objectname=new Classname();
	   T7.addition(); //170
	   T7.multiplcation();//6000
	   
	   //Create object of different class
	   Test4 T8=new Test4("Virat"); //Classname objectname=new Classname();
	   T8.school(); //Virat
	   
   }
}
