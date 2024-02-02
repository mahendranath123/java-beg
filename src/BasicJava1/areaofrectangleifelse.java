package BasicJava1;
import java.io.*;
public class areaofrectangleifelse {
	
	public static void main (String[]args)throws IOException
	{
		int l,b;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter the length");
		l=Integer.parseInt(br.readLine());
		
		System.out.println("enter a breath");
		b=Integer.parseInt(br.readLine());
		
		System.out.println("Area of rectangle "+(l*b));
	}

}
