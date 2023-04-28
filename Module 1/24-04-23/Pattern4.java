package ExOf_24_04;

public class Pattern4 {

	public static void main(String[] args) 
	{
		int space = 0;
		for(int i = 1; i <= 5; i++)
		{
			for(space = 0; space != (5 - i); space++)
			{
				System.out.print(" ");
			}
			for(int j = 5; j > space; j--)
			{
				System.out.print("*");
			}
			
			System.out.println();	
		}
		
	}
}
