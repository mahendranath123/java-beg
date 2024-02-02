package BasicJava1;
import java.io.*;
public class areaofcircleifelse {
	
	public static void main(String[]args)throws IOException
	{
		double r;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("enter a radius");
		r=Integer.parseInt(br.readLine());
		
		System.out.println("area of circle"+(3.14*r*r));
	}

}
