package ExOf_01_05;

// Multilevel and multiple combine 

class A
{

	void a()
	{
		System.out.println("Hello from A.");
	}
	
}

class B extends A
{
	void b()
	{
		System.out.println("Hello from B.");
		
	}
	
}

interface C
{
	void c();
	
}

class D extends B implements C
{
	void d()
	{
		System.out.println("Hello from D.");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("Hello from C.");
	}
	
}



public class Hybrid 
{
	public static void main(String[] args) 
	{
		D d1 =new D();
		
		d1.a();
		d1.b();
		d1.c();
		d1.d();
		
		
	}

}
