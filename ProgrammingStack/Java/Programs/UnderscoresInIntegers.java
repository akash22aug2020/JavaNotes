package Programs;

public class UnderscoresInIntegers 
{
	public static void main(String[] args) 
	{
		int a = 123_456_789;
		int b = 123__456__789;
		int c = 123___456___789;
		int d = 123___456__789;
		int e = 1_2_3_4_5_6_7_8_9;
		
		System.out.println("123_456_789 = "+a);
		System.out.println("123__456__789 = "+b);
		System.out.println("123___456___789 = "+c);
		System.out.println("123___456__789 = "+d);
		System.out.println("1_2_3_4_5_6_7_8_9 = "+e);
	}
}

