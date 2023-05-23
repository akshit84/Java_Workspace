package ExOf_01_05;

class GrandFather
{
	void GF()
	{
		System.out.println("Grand father access ");
	}
}

class Father extends GrandFather
{
	void F() 
	{
		System.out.println("Father access.");
		
	}
}

class Son extends Father
{
	void S()
	{
		System.out.println("Son access");
	}
}

public class Multilvl_Inheri {
	public static void main(String[] args) 
	{
		Son s1 = new Son();
		s1.F();
		s1.S();
		s1.GF();
		
		
	}

}
