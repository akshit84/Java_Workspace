package ExOf_01_05;


class Bank
{
	
	void b()
	{
		System.out.println("Bank data.");
	}
}

class Current extends Bank
{
	
	void c()
	{
		System.out.println("Current Ac data.");
	}

}

class Saving extends Bank
{
	
	void s()
	{
		System.out.println("Saving Ac data.");
	}
}


public class Hierarchical 
{
	public static void main(String[] args) 
	{
		
		Current c1 =new Current();
		Saving s1 =new Saving();
		
		c1.c();
		c1.b();
		
		s1.s();
		s1.b();
		
		
	}

}
