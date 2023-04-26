package Exof_21_04;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a year :-");
		int y=sc.nextInt();
		
		if((y%4)==0)
		{
			System.out.println("It is leap year.");
		}
		else
		{
			System.out.println("It is not leap year.");
		}

	}
}
