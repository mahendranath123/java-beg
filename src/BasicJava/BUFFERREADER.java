package BasicJava;

import java.io.*;
public class BUFFERREADER {
	
	public static void main(String[]args)throws IOException
	{
		int a,b;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First Value");
		 a=Integer.parseInt(br.readLine());
		 System.out.println("Enter Second value");
		 b= Integer.parseInt(br.readLine());
		 System.out.println("Addition="+(a+b));
	}

}
