package ExOf_24_04;

public class Pattern15 {

	public static void main(String[] args) 
	{
		int i,j;
		for( i = 1; i <= 5; i++)
		{
			for(j = 1; j <= 5 - i; j++)
			{
				System.out.print(" ");
			}
			
			for( j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();	
		}
		for(i = 5 -1; i >= 1; i--)
		{
			for(j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
