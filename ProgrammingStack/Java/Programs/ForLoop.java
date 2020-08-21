package Programs;

public class ForLoop 
{
	public static void printNaturalNumbers(int limit)
	{
		for(int i=1; i<=limit; i=i+1)
			System.out.println(i);
	}

	public static void main(String[] args) 
	{
		int n = 10;
		printNaturalNumbers(n);
	}
}





