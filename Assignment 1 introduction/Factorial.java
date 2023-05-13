package Exof_21_04;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) 
	{
		
		int fact=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want to find factorial :- ");
		int a=sc.nextInt();
		
		for (int i = 1; i <= a; i++)
		{
			fact = i * fact;
		}
		System.out.println("factorial of "+a+" is :-"+fact);
		
	}

}
