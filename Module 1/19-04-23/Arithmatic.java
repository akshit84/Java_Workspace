package ExOf_19_04;

import java.util.Scanner;

public class Arithmatic {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any two number:-");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		double sum=a+b;
		double sub=a-b;
		double mul=a*b;
		double div=a/b;
		double mod=a%b;
		
		System.out.println("Sum of "+a+" and "+b+" is:-"+sum);
		System.out.println("Subtraction of "+a+" and "+b+" is:-"+sub);
		System.out.println("Multiplication of "+a+" and "+b+" is:-"+mul);
		System.out.println("Division of "+a+" and "+b+" is:-"+div);
		System.out.println("Modulo of "+a+" and "+b+" is:-"+mod);
		
	}

}
