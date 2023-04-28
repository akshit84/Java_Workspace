package ExOf_24_04;

public class Pattern14 {
	public static void main(String[] args) 
	{
		int i,j,space;
		//Row
		for(i = 1; i <= 9; i++)
		{
			for(j = i; j <= 9; j++)
			{
				System.out.print("*");
			}
			for(space = 1; space < i; space++)
			{
				System.out.print(" ");
			}
			for(space = 1; space < i; space++)
			{
				System.out.print(" ");
			}
			//Column
			for(j = i; j <= 9; j++)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
		/*for(i = 1; i <= 9; i++)
		{
			for(space = 1; space <= i; space++)
			{
				System.out.print(" ");
			}
			//Column
			for(j = i; j <= 9; j++)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}*/
		
	}

}
