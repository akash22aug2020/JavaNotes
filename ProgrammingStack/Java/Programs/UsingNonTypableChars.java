package Programs;

public class UsingNonTypableChars 
{
	public static void main(String[] args) 
	{
		char ch1 = 181;
		System.out.println("Decimal representation 181 corresponds to character = "+ch1);
		
		ch1 = '\265';
		System.out.println("Octal representation \265 corresponds to character = "+ch1);
		
		ch1 = '\u00B5';
		System.out.println("Octal representation \u00B5 corresponds to character = "+ch1);
	}
}





