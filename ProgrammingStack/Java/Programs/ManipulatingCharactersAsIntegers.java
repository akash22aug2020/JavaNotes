package Programs;

public class ManipulatingCharactersAsIntegers 
{
	public static void main(String[] args) 
	{
		char ch1 = 'a';
		System.out.println("ch1 = "+ch1);

		ch1 = (char) (ch1 + 1);
		System.out.println("ch1 + 1 = "+ch1);

		ch1 = (char) (ch1 - 1);
		System.out.println("ch1 - 1 = "+ch1);

		ch1 = (char) (ch1 * 10);
		System.out.println("ch1 * 10 = "+ch1);

		ch1 = (char) (ch1 / 5);
		System.out.println("ch1 / 5 = "+ch1);
	}
}




