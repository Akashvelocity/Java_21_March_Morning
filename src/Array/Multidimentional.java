package Array;

public class Multidimentional
{
	       //0    //1   //2
	//0   // 10    20   30
	//1   // 40    50   60

	public static void main(String[] args)
	{
		
	//Step-1: Array Declaration

	int[][] M1=new int[2][3]; //2-->Row size //3-->Column size

	//Step-2: Array Initilisation/Assignment
	M1[0][0]=10;
	M1[0][1]=20;
	M1[0][2]=30;
	M1[1][0]=40;
	M1[1][1]=50;
	M1[1][2]=60;

	//Step-3: Usage
	System.out.println(M1[0][0]);//10
	System.out.println(M1[0][1]); //20
	System.out.println(M1[0][2]); //30
	
	System.out.println(M1[1][0]); //40
	System.out.println(M1[1][1]); //50
	System.out.println(M1[1][2]); //60
	}
}
