package Exof_21_04;

import java.util.Scanner;

public class GradeSystem {
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the marks of Maths,Englis,Gujarati,Science,Computer :-");
		int m=sc.nextInt();
		int e=sc.nextInt();
		int g=sc.nextInt();
		int s=sc.nextInt();
		int c=sc.nextInt();
		
		float sum=m+e+g+s+c;
		
		float per=(sum/500)*100;
		
		System.out.println("Sum is :-"+sum);
		System.out.println("Percentage is :-"+per);
		
		if(per > 75)
		{
			System.out.println("Your result is :- Distinction");
		}
		else if(per > 60 && per <= 75)
		{
			System.out.println("Your result is :- First class");
		}
		else if(per > 50 && per <= 60)
		{
			System.out.println("Your result is :- Second class");
		}
		else if(per > 35 && per <= 50)
		{
			System.out.println("Your result is :- Pass class");
		}
		else
		{
			System.out.println("Your result is :- Fail");
		}
	}

}
