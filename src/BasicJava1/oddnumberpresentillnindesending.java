package BasicJava1;
import java.io.*;
public class oddnumberpresentillnindesending {
	
	public static void main(String[]args) throws  IOException
	{
	   int n;
	   BufferedReader  br=new BufferedReader (new InputStreamReader(System.in));
	   System.out.println("enter a value");
	   n=Integer.parseInt(br.readLine());
	   while (n>0)
	   {
		 if (n%2!=0)
		 System.out.println("n="+n);
	      n--;
			 
	   }
	   
	}

}
