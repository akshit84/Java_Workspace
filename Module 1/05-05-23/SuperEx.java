package Ex_Of_05_05;

// When two class has same variable name and when it's called only second class variable's value is print but we want to print first
// class variable value we assign these variable to super
class Sup
{
	int a=100;
	
}

class Sup2 extends Sup
{
	int a=120;
	
	void display()
	{
		System.out.println(a);//called child class variable 
		System.out.println(super.a);// called parent class variable
	}
	
}
public class SuperEx 
{
	
	public static void main(String[] args) 
	{
		Sup2 s =new Sup2();
		
		s.display();
		
	}
	
}
