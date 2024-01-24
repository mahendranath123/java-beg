package BasicJava;
import java.io.*;
public class drivinglince {
	
		public static void main(String[]args)throws IOException
		{
		 int a;
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the age");
		 a=Integer.parseInt(br.readLine());
		 if (a>=18)
		 {
			System.out.println("you are eliglible");
		
		 }
        else 
		 {
			 System.out.println("you are not eliglible");
		 }
				 
		}
	

}
