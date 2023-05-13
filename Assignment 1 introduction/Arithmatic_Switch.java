package Exof_21_04;
import java.util.Scanner;

public class Arithmatic_Switch {

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Any two number :-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		int num=sc.nextInt();
		
		switch(num) 
		{
		
			case 1:System.out.println("Addition of "+a+" and "+b+" is :-"+(a+b));
			break;
			
			case 2:System.out.println("Subtraction of "+a+" and "+b+" is :-"+(a-b));
			break;
			
			case 3:System.out.println("Multiplication of "+a+" and "+b+" is :-"+(a*b));
			break;
			
			case 4:System.out.println("Division of "+a+" and "+b+" is :-"+(a/b));
			break;
		}
		
	}
}
