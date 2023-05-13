package Exof_21_04;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) 
	{
		
		int max=0,temp,reminder;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number :-");
		int a=sc.nextInt();
		
		for(int i = 1; i <= a; i++)
		{
			reminder = a % 10;
			a /= 10;
			if(reminder > max)
			{
				max = reminder;
				
			}
			
		}
		System.out.println(max);
	}

}
