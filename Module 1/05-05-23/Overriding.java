package Ex_Of_05_05;

class Mybank
{
	int rate()
	{
		return 0;
	}
}

class Sbi extends Mybank
{
	int rate()
	{
		return 7;
	}
}
class Axis extends Sbi
{
	int rate()
	{
		return 8;
		
	}
}

public class Overriding 
{
	public static void main(String[] args) 
	{
		// Reference variable of Mybank
		Mybank b;
		
		b =new Sbi();
		System.out.println(b.rate());
		
		b =new Axis();
		System.err.println(b.rate());
		
	}

}
