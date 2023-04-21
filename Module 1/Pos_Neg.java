package ExOf_19_04;

import java.util.Scanner;

public class Pos_Neg {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter any number :-");
		int a=sc.nextInt();
		
		if(a>0) 
		{
			System.out.println("Entered number is Positive.");
		}
		else
		{
			System.out.println("Entered number is negetive.");
		}
	}
}
