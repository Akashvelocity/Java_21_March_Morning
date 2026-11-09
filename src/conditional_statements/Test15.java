package conditional_statements;

public class Test15 
{
     public static void main(String[] args)
     {
    	 int day=15;
    	 switch(day) // 15
    	 {
    	 case 1: System.out.println("Today is Monday"); break;  // 1  4__>false
    	 case 2: System.out.println("Today is Tuesday");break;  // 2  4__>false
    	 case 3: System.out.println("Today is Wednesday");break; // 3 4__>false
    	 case 4: System.out.println("Today is Thursday");break; // 4  4__>true
    	 case 5: System.out.println("Today is Friday");break;
    	 case 6: System.out.println("Today is Saturday"); break;
    	 case 7: System.out.println("Today is Sunday"); break;
    	 default : System.out.println("Invalid Output");break;
    	 
    	 }
     }
}
