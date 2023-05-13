package Exof_21_04;
import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
	
		int reverse=0,reminder;
		System.out.println("Enter a number :-");
		int a=sc.nextInt();
		
		while(a != 0)
		{
			reminder = a % 10;
			
			reverse = reverse * 10 + reminder;
			
			a = a / 10;
			//a++;
		}
		System.out.println(reverse);
	}
}
