package Assignment1;

public class Result extends Marks
{
  int total;
   void calculate()
   {
	   total=Marks1+Marks2;
   }
   void getResult()
   {
	   System.out.println("total marks :"+total);
   }
   public static void main(String[] args)
   {
	   Result R1=new Result();
	   R1.setstudentInfo(55,"Akash");
	   R1.getstudentinfo();
	   R1.setMarks(70, 85);
	   R1.getMarks();
	   R1.calculate();
	   R1.getResult();
	   System.out.println("===========================");
	   Result R2=new Result();
	   R2.setstudentInfo(21,"Abhijit");
	   R2.getstudentinfo();
	   R2.setMarks(69, 71);
	   R2.getMarks();
	   R2.calculate();
	   R2.getResult();  
   }
}

     