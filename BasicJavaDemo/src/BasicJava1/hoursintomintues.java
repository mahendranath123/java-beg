package BasicJava1;
import java.io.*;
public class hoursintomintues {
	public static void main (String[]args)throws IOException
	{
		int m;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the hour");
	    m= Integer.parseInt(br.readLine());
	    System.out.println("convert into mintues="+(m*60*60));
		
	}

}
