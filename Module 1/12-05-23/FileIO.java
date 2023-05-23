package ExOf_12_05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			String s1="Hello";
			FileOutputStream f =new FileOutputStream("E://Test.txt");
			try 
			{
				f.write(s1.getBytes());
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success");
		
	}
	

}
