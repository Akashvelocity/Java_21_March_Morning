package Array;

public class Sample4 
{
	                //   0    //1    //2
	          //0 //    10    20      30
	          //1 //    40    50      60
	public static void main(String[] args)
	{
	//Step-1: Array Declaration + Array Initilisation/Assignment
	int[][] M1= { {10,20,30}, {40,50,60} };

	     //Step-2: Usage
	    //Outer for loop: Rows
	     //inner for loop: columns
	   //i=0    //0<=1 //1
	           //1<=1  //2
	            //2<=1
	for(int i=0; i<=1; i++)
	{

	        //a=0 //0<=2 //1
	              //1<=2 //2
            	//2<=2 //3
	            //3<=2
	for(int a=0; a<=2; a++)
	{
	System.out.print(M1[i][a]+ " "); //10 20 30
	                                 //40 50 60

	}
	System.out.println();
	}
   }
   }
