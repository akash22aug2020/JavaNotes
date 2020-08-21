package Programs;

public class IfStatement 
{
	public static void isNumberGreaterThan100(int num)
	{
		if(num > 100)
			System.out.println(num+" is greater than 100");
	}

	public static void main(String args[])
	{
		int num1 = 139;
		int num2 = 57;

		isNumberGreaterThan100(num1);
		isNumberGreaterThan100(num2);	
	}
}



