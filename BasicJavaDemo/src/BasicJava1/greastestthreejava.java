package BasicJava1;
import java.io.*;
public class greastestthreejava {
	
	public static void main (String[]args)throws IOException
	{
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a 3 number");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		
		if (a>b&&a>c)
		{
			System.out.println("a is greater ");
		
		}
		else if (b>a&&b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.print("c is greater");
		}
		
	}

}
