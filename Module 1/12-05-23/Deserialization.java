package ExOf_12_05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization 
{
	public static void main(String[] args) 
	{
		try 
		{
			ObjectInputStream o =new ObjectInputStream(new FileInputStream("E:\\ Akshit.txt"));
			String a =(String) o.readObject() ;
			System.out.println(a);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	} 

}
