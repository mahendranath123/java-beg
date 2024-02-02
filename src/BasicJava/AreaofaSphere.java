package BasicJava;
import java.io.*;
public class AreaofaSphere {
	
	public static void main(String[]args)throws IOException
	{
		double g;
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the value ");
		 g =Double.parseDouble(br.readLine());
		 System.out.println("Convert into area of sphere="+(314*4*g*g));
	}

	
}
