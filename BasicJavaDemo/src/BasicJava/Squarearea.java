package BasicJava;
import java.io.*;
public class Squarearea {
	
	public static void main(String[]args)throws IOException
	{
		int a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the side1");
		a= Integer.parseInt(br.readLine());
		 System.out.println("Enter the side2");
		 b= Integer.parseInt(br.readLine());
		 System.out.println("Area of square="+(a*b));
	}

}
