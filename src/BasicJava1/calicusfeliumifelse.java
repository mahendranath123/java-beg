package BasicJava1;
import java.io.*;
public class calicusfeliumifelse {
	
	public static void main (String[]args)throws IOException
	{
		double c;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter the calicus and F");
		c=Double.parseDouble(br.readLine());
		double fahrenheit = (c * 9.0 / 5.0) + 32;
        System.out.println("CONVERT TEMPERATURE TO FAHRENHEIT = " + fahrenheit);
		
	}

}
