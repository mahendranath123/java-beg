package BasicJava1;
import java.io.*;
public class additiondemoifelse {
	
	public static void main (String[]args)throws IOException
	{
		int a,b;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter  a  first number");
		a=Integer.parseInt(br.readLine());
		
		System.out.println("enter a second number");
		b=Integer.parseInt(br.readLine());
		  
		System.out.println("ADDITION ="+(a+b));
		
		
		
	}

}
