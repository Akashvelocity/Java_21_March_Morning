package Assignment1;

public class Student 
{
   String name;
   int rollno;
    void setstudentInfo(int sroll, String sname)
   {
    name=sname;
    rollno=sroll;
   }
    void getstudentinfo()
    {
    	System.out.println("Roll No : "+rollno);
    	System.out.println("Name : "+name);
    }
}
