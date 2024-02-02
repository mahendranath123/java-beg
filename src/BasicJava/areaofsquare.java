package BasicJava;
import java.io.*;
public class areaofsquare
{
	public static void main(String[]args)throws IOException
	{
		int s;
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the value");
		 s=Integer.parseInt(br.readLine());
		 System.out.println("area of square="+(s*s));	
		 
	}

}
