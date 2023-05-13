package Exof_21_04;

import java.util.Scanner;

public class SummationOfFirstAndLast {
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		int first = 0,last;
		
		System.out.println("Enter any number :-");
		int a=sc.nextInt();
		
		last = a % 10;
		
		while(a != 0)
		{
			first = a % 10;
			a /= 10;
			
		}
		System.out.println("Sum is :-"+(first+last));
	}

}
