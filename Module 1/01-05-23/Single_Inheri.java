package ExOf_01_05;

class Ac
{
	void A()
	{
		System.out.println("Ac is access.");
	}
	
}

class Mobile extends Ac
{
	void M() 
	{
		System.out.println("Mobile access.");
	}
}
public class Single_Inheri {

	
	public static void main(String[] args) 
	{
		Mobile m1=new Mobile();
		m1.M();
		m1.A();
		m1.M();
		
		
	}
}
