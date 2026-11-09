package Array;

public class Sample3
{
	public static void main(String[] args)
	{

	      //Step-1: Array Declaration + Array Initilisation/Assignment

	            //0   1   2   3   4
	char[] ar2= {'A','b','x','y','Z'};
	
	   //Length/Size of an Array
	    int Sizeofanarray = ar2.length; //5
	System.out.println("Length/Size of an Array:" + Sizeofanarray);//5
	
	//Last index of an array : length-1= Last index
	int Lastindexofanarray = ar2.length-1; //4
	System.out.println("Last index of an array: " + Lastindexofanarray); //4

	          //Step-2: Usage
	             //i=0
	            int i=0;
	             //0<=4
	             //1<=4
	             //2<=4
	             //3<=4
	             //4<=4
	             //5<=4
        	while(i<=ar2.length-1) //4
	{                           //4
	System.out.print(ar2[i]+" "); //ar2[1] A b x y Z
                 	//1
	                //2
	                //3
	                //4
	                 //5
	                i++;
     }
    }
    }
