package ExOf_24_04;

import java.util.Scanner;

public class FibonacciWithFunc {

	public void Fibonacci(int terms)
	{
		int first=0,second=1,next;
		
		System.out.print(first+" "+second);
		
		for(int i = 3; i <= terms; i++)
		{
			next = first + second;
			first = second;
			second = next;
			System.out.print(" "+next);
		}
		
	}
	public static void main(String[] args) 
	{
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the terms of Fibonacci series :-");
		int a=sc.nextInt();
		
		
		FibonacciWithFunc f=new FibonacciWithFunc();
		f.Fibonacci(a);
	}
}
