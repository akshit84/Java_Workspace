package ExOf_19_04;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Principal :-");
		int p=sc.nextInt();
		
		System.out.println("Enter the Interest rate :-");
		int r=sc.nextInt();
		
		System.out.println("Enter time in year :-");
		int t=sc.nextInt();
		
		float SimpleInterest=(p*r*t)/100;
		
		System.out.println("Simple Interest is :-"+SimpleInterest);
	}

}
