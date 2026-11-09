package Method;

public class Demo9 
{
      public static void main(String[] args)
      {
    	  cricketinfo("Virat", 10000, 51, 'A', 50.34 );
    	  cricketinfo("Rohit", 8000, 100, 'B', 38.29);
      }
      // static regular method__> with parameter method
      public static void cricketinfo(String playername, int runs, int wicket, char contractgrade, double avgruns)
      {
    	  System.out.println(playername);
    	  System.out.println(runs);
    	  System.out.println(wicket);
    	  System.out.println(contractgrade);
    	  System.out.println(avgruns);
      }
}
