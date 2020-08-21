package Programs;

public class ExceedingRangeOfDatatypes 
{
	public static void main(String[] args) 
	{
		short s1 = 129;           

		byte b1 = (byte)s1;      // the range of byte data type is -127 to 128

		System.out.println("b1 = "+b1);

		//------------------------------------------------------------------------------------------------//

		long l1 = 2147483648L;    

		int i1 = (int)l1;         // the range of integer data type is -2147483648 to 2147483647

		System.out.println("i1 = "+i1);
	}
}







