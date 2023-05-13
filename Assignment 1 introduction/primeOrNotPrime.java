package Exof_21_04;

import java.util.Scanner;

public class primeOrNotPrime {
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		int flag=0;
		
		System.out.println("Enter any number :-");
		int a=sc.nextInt();
		
		for(int i = 2; i <= (a/2); i++)
		{
			if((a % i) == 0)
			{
				System.out.println("Number is not prime.");
				flag=1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Number is prime.");
		
	}

}
