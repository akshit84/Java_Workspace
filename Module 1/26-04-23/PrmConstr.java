package ExOf_26_04;

public class PrmConstr 
{
	int num;
	String name;
	public PrmConstr(int a,String n) 
	{
		num=a;
		name=n;
	}
	void display() 
	{
		System.out.println(num+" "+name);
	}
	public static void main(String[] args) 
	{
		PrmConstr p =new PrmConstr(897, "Akshit");
		//PrmConstr p2 =new PrmConstr();
		System.out.println(p.num+""+p.name);
		//p.display();
	
		
	}

}
