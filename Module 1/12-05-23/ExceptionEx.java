package ExOf_12_05;

public class ExceptionEx 
{
	
	public static void main(String[] args) 
	{
		try 
		{
			int a=10/0;
			System.out.println(a);
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
