package Array;

public class Sample2 
{
	public static void main(String[] args)
	{
	       //Step-1: Array Declaration + Array Initilisation/Assignment

	            // 0   1    2
	int[] ar1 = {100, 200, 300};
	
	        //Length/Size of an Array
	System.out.println("Length of an Array :" + ar1.length); //3
	
	    //Last index of an array : length-1= Last index
	System.out.println("Last index of an array :" + (ar1.length-1));//2

	         //Step-2: Usage
	       //i=0    //0<=2         //1
	                //1<=2         //2
	               //2<=2          //3
	               //3<=2
	   for(int i=0; i<=ar1.length-1; i++)
	  {    
		                                      //2
	   System.out.print(ar1[i]+" "); //ar1[2] //100 //200 //300

	   }
	}
  }
