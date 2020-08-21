package Programs;

public class ScopeOfVariable 
{
	public static void main(String[] args) 
	{
		int a; // Lifetime of variable 'a' begins when this line gets executed.

		a = 10;

		{
			int b;   // Lifetime of variable 'b' begins when this line gets executed.

			b = 20;

			/*
			 * Both the variables 'a' and 'b' have scope within the inner code block
			 */
			System.out.println("a = "+a);   
			System.out.println("b = "+b);

		}  // lifetime of variable 'b' ends with the close of the inner code block.

		/*
		 * Only variable 'a' has scope within the outer code block
		 * 
		 */
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	} // lifetime of variable 'a' ends with the close of the inner code block.
}




