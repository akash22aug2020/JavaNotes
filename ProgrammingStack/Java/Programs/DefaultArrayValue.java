package Programs;

import java.util.Arrays;

public class DefaultArrayValue 
{
	public static void main(String[] args) 
	{
		byte b[] = new byte[5];
		System.out.println("Default byte array = "+Arrays.toString(b));
		
		short s[] = new short[5];
		System.out.println("Default short array = "+Arrays.toString(s));
		
		int i[] = new int[5];
		System.out.println("Default int array = "+Arrays.toString(i));
		
		long l[] = new long[5];
		System.out.println("Default long array = "+Arrays.toString(l));
		
		float f[] = new float[5];
		System.out.println("Default float array = "+Arrays.toString(f));
		
		double d[] = new double[5];
		System.out.println("Default double array = "+Arrays.toString(d));
		
		char ch[] = new char[5];
		System.out.println("Default char array = "+Arrays.toString(ch));
		
		boolean bool[] = new boolean[5];
		System.out.println("Default boolean array = "+Arrays.toString(bool));
		
		String str[] = new String[5];
		System.out.println("Default string array = "+Arrays.toString(str));
	}
}




