package ExOf_24_04;

import java.util.Scanner;

public class FactRecur {
	
	 int Factorial(int n)
	{
		/*
		 * if(n==0 && n==1) { return 1; }
		 * 
		 * else { return n * Factorial(n - 1); }
		 */

		 
		 
		 if (n >= 1)
		 {
			  return n * Factorial(n - 1);

		 }
	     else
	     {
	    	   return 1;
	     }
	         
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number you want to fid factorial :-");
		int a=sc.nextInt();
		
		FactRecur f=new FactRecur();
		
		System.out.println(f.Factorial(a));
		
	}

}
