package ExOf_19_04;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number :-");
		int a=sc.nextInt();
		
		if((a%2)==0)
		{
			System.out.println("Entered number is even.");
		}
		else
		{
			System.out.println("Entered number is odd.");
		}
				
	}
}