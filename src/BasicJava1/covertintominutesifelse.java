package BasicJava1;
import java.io.*;
public class covertintominutesifelse {
	
	public static void main (String[]args)throws IOException
	{
		double s,m;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter a value that can convert into minutes");
		s= Double.parseDouble(br.readLine());
		m=s/60;
		System.out.println("covert into minutes"+m);
		
	}

}
