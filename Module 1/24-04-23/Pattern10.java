package ExOf_24_04;

public class Pattern10 {
	public static void main(String[] args) 
	{
		int flag=1;
		for(int i =1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(flag==0) 
				{
					System.out.print(flag);
					flag += 1;
				}
				else
				{
					System.out.print(flag);
					flag -= 1;
				}
			}
			
			System.out.println();
			
		}

		
	}
}
