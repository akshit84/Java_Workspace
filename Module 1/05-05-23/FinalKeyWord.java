package Ex_Of_05_05;

//Final keyword use for class,method and variable. Final class can't be modifies or extended, a variable can't be modified and
// also a method can't be modified.

final class A
{
	void run()
	{
		System.err.println("it is final class");
	}
}
//here final class can't be extended
/*class B extends A
{
	void display()
	{
		System.out.println();
	}
	
}*/


public class FinalKeyWord 
{
	public static void main(String[] args) 
	{
		final int a = 100;
		// Her we assign a new value for variable but final variable can't modified
		//a = 120;
		
		System.out.println(a);
		
		
	}
	

}
