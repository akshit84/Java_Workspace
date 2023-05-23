package ExOf_12_05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			String a="Welcom to Akshit file";
			FileOutputStream f =new FileOutputStream("E:\\ Akshit.txt");
			ObjectOutputStream o =new ObjectOutputStream(f);
			o.writeObject(a);
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Success");
		
	}

}
