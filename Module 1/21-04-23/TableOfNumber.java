package Exof_21_04;
import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number you want to see table :-");
		int a=sc.nextInt();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		
	}
}
