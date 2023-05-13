package Exof_21_04;

import java.util.Scanner;

public class Nested_IfElse {

	public static void main(String[] args) 
	{
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter any three number :-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a >= b )
		{
			if (a >= c)
			{
				System.out.println("A is Grater.");
				
			}
			else
			{
				System.out.println("C is Grater.");
			}
		}
		else 
		{
			if(b >= c)
			{
				System.out.println("B is Grater.");
			}
			
			else
			{
				System.out.println("C is Grater.");
			}
		}
	}
}
			
			