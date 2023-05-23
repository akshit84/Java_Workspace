package ExOf_01_05;

/* Multiple Inheritance is not supported in java therefore we use interface.
 * here interface doesn't support method body part and class don't allowed method without body part that's why we override method in
 * class and create their body part 
 */

interface F
{
	void f();	
	
}

// Like 2 class
interface M
{
	void m();
	
	
}


class S implements F,M
{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("Father access");
		
	}
	
	
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("Mother access");
		
	}
	
}

public class Multiple_Inheri {
	
	
	public static void main(String[] args) 
	{
		S s1 =new S();
		s1.f();
		s1.m();
	}

}
