package ExOf_24_04;

public class pattern13 {
	public static void main(String[] args) 
	{
		int i,j;
		for(i = 5 ; i >= 1; i--)
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
