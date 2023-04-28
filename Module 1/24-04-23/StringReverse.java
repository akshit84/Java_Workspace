package ExOf_24_04;

import java.util.Scanner;

public class StringReverse {
	
	public void reverse(String n) 
	{
		String name=n; 
		char[] a=name.toCharArray();
		 
		System.out.println("Length of string is :-"+a.length);
		
		System.out.print("Reversed string is :-");
		for(int i = a.length - 1; i >= 0; i--)
		{
			System.out.print(a[i]);
		}		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		StringReverse r=new StringReverse();
		
		System.out.println("Enter a string :-");
		String a=sc.next();
		
		r.reverse(a);
		
	}
}
