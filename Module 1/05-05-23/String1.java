package Ex_Of_05_05;

public class String1 
{
	
	public static void main(String[] args) 
	{
		
		String s="Akshit";//literal string
		
		String s1 =new String("Akshit");//new keyword string
		
		char ch[]= {'a','k','s','h','i','t'};//character array string 
		String s2 =new String(ch);
		String s3="Hello";
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s.charAt(3));
		System.out.println(s1.compareTo(s));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s.concat(s2));
		System.out.println(s3.length());
		System.out.println(s.equals(s3));
		
	}

}
