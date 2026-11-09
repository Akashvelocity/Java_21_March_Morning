package Variable;

public class Sample2 
{

	// JVM_(1)__>Comment(Ignore)   // Compiler_(2)__>Comment(Ignore)
	public static void main(String[] args)
	{
	// Step_(1)_Variable Declaration
	String StudentName;   // DataType VariableName
	int StudentRollNo;    // DataType VariableName
	float StudentPercentage;  // DataType VariableName
	char StudentGrade;       // DataType VariableName

	// Step_(2)_Variable Initialization/Assignment
	StudentName="Rohit";        // VariableName="Data/Information/Value"
	StudentRollNo=101;           // VariableName=Data/Information/Value
	StudentPercentage=70.88f;      // VariableName=Data/Information/Value
	StudentGrade='A';                 // VariableName='Data/Information/Value'

	// Step_(3)_Variable Usage
	System.out.println("Name of Student:- "+StudentName);    // Rohit
	System.out.println("Roll no of Student:- "+StudentRollNo);     // 101
	System.out.println("Percentage of Student:- "+StudentPercentage+"%");    // 70.88
	System.out.println("Grade of Student:- "+StudentGrade);       // A 

	}



}
