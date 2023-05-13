package ExOf_19_04;

import java.util.Scanner;

public class Area_of_Tringle {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter the Base :-");
		int b=sc.nextInt();
		
		System.out.println("Enter the Height");
		int h=sc.nextInt();
		
		float area=(b*h)/2;
		
		System.out.println("Area of tringle is :-"+area);
	}

}
