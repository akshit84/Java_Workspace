package Exof_21_04;

import java.util.Scanner;

public class AreaUsingIf {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Choose your operatin");
		System.out.println("Press 1 for Area of tringle");
		System.out.println("Press 2 for Area of rectangle");
		System.out.println("press 3 for area of circle");
		
		int a=sc.nextInt();
		
		if(a == 1)
		{
			System.out.println("Enter the Base and Hight of tringle :-");
			float b=sc.nextInt();
			float h=sc.nextInt();
			float tringle = (b * h) / 2;
			System.out.println("Area of tringle is :-"+tringle);
		}
		else if(a == 2)
		{
			System.out.println("Enter the width and length of rectangle :-");
			float w=sc.nextInt();
			float l=sc.nextInt();
			float rectangle= w * l;
			System.out.println("Area of rectangle is :-"+rectangle);
		}
		else if(a == 3)
		{
			System.out.println("Enter the radius of circle :-");
			float r=sc.nextInt();
			float pi=(float) 3.14;
			float circle= (pi * r * r) / 2;
			System.out.println("Area of rectangle is :-"+circle);
		}
		else
			System.out.println("Sorry !! You entered wrong number.");
		
	}
}
