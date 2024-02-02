package BasicJava1;
import java.io.*;
public class additiondowhileloop {
	
	public static void main (String[]args)throws IOException
	{
		
		int a,b;
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String ch;
		do 
		{
		  System.out.println("enter a number");
		  
		  a=Integer.parseInt(br.readLine());
		  b=Integer.parseInt(br.readLine());
		  System.out.println("addition="+(a+b));
		  System.out.println("do you continue Y/N");
		  ch=br.readLine();
		}
		while(ch.equals("Y")||ch .equals ("y"));
	}

}
