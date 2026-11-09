package Assignment1;

public class Marks extends Student
{
  int Marks1;
  int Marks2;
  
  void setMarks(int m1, int m2)
  {
	  Marks1=m1;
	  Marks2=m2;
  }
  
  void getMarks()
  {
	  System.out.println("Subject 1 Mark : "+Marks1);
	  System.out.println("Subject 2 Mark : "+Marks2);
  }
}
