package Constructor;

public class Cricket 
{
    // Non Static Global Variable
	 String playername; 
	 int Runs;
	 // Constructor: Constructor name should be same class name
	 // use: Constructor is used to initialize object and Non static Global variable
	 Cricket(String P1, int R1)
	 {
		 playername=P1;
		 Runs=R1;
	 }
	 public static void main(String[] args)
	 {
		 // Step I: Create  object of same class
		  Cricket RCB=new Cricket("Virat",100);  // classname objectname=new classname();
		  System.out.println(RCB.playername); // null  // objectname.variablename;
		  System.out.println(RCB.Runs); // 0  // Objectname.variablename;
		  
		  //  Step I: Create object of Same class
		  Cricket CSK=new Cricket("Sanju",101);  // Classname objectname=new classname();
		  System.out.println(CSK.playername); // null //objectname.variablename;
		  System.out.println(CSK.Runs); // 0 //objectname.variablename;
		  
		  // Step I: Create object of same class
		  Cricket MI=new Cricket("Rohit",102);     // Classname objectname=new classname();
		  System.out.println(MI.playername);  // null // objectname.variablename;
		  System.out.println(MI.Runs);//0 //Objectname.variable;
	 }
}
