package Programs;

public class NumberRepresentation 
{
	//100 (decimal) = 1100100 (binary) = 144 (octal) = 64 (hexadecimal)
	public static void main(String[] args) 
	{
		int binary = 0b11_00_100;
		System.out.println("binary 0b11_00_100 = "+binary+" in decimal");
		
		int octal = 01_4_4;
		System.out.println("octal 01_4_4 = "+octal+" in decimal");
		
		int decimal = 1_0_0;
		System.out.println("decimal 1_0_0 = "+decimal+" in decimal");
		
		int hexaDecimal = 0x6_4;
		System.out.println("hexaDecimal 0x6_4 = "+hexaDecimal+" in decimal");
	}
}






