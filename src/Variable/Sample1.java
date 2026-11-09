package Variable;

public class Sample1 
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
	System.out.println(StudentName); // Rohit
	System.out.println(StudentRollNo);   // 101
	System.out.println(StudentPercentage);  // 70.88
	System.out.println(StudentGrade);   // A 

	}

}
