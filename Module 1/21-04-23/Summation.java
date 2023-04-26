package Exof_21_04;

import java.util.Scanner;

public class Summation {
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		int sum=0,reminder; 
		
		System.out.println("Enter a numbner :-");
		int a=sc.nextInt();
		
		while(a != 0)
		{
			reminder = a % 10;
			sum = sum + reminder;
			a /= 10;
		}
		System.out.println(sum);
	}

}
