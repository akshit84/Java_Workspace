package Exof_21_04;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		int first=0;
		int second=1;
		int next = 0;
		
		System.out.println("Enter the term of Fibonacci series :-");
		int a=sc.nextInt();
		
		System.out.print(first+" "+second);
		
		for(int i = 3; i <= a; i++)
		{
			next = first + second;
			first = second;
			second = next;
			System.out.print(" "+next);
			
		}
		
		
	}
}
