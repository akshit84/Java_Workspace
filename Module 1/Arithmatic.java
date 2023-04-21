package ExOf_19_04;

import java.util.Scanner;

public class Arithmatic {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any two number:-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		float div=a/b;
		int mod=a%b;
		
		System.out.println("Sum of "+a+" and "+b+" is:-"+sum);
		System.out.println("Subtraction of "+a+" and "+b+" is:-"+sub);
		System.out.println("Multiplication of "+a+" and "+b+" is:-"+mul);
		System.out.println("Division of "+a+" and "+b+" is:-"+div);
		System.out.println("Modulo of "+a+" and "+b+" is:-"+mod);
		
	}

}
