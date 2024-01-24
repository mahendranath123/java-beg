package BasicJava1;
import java.io.*;
public class hourstoseconds {
	public static void main(String[]args)throws IOException
	{
		int s;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the hours");
		
		s=Integer.parseInt(br.readLine());
		
		int minute = s*60;
		int seconds = s*3600;
		
		System.out.println("there are " + minute + " minutes in " + s + " hours");
		System.out.println("there are " + seconds + " seconds in " + s + " hours");
	}

}
