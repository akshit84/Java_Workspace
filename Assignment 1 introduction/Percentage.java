package ExOf_19_04;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
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
	}
}
