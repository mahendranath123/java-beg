package BasicJava1;
import java.io.*;
public class drivinglinscesif {
	
	public static void main (String[]args) throws IOException
	{
		
	
	int a;
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
     System.out.println("enter the number");
	 a=Integer.parseInt(br.readLine());
	 if (a>=18)
	 {
		 System.out.println("you are eligiable");
	 }
		 
	 else
	 { 
		 System.out.println("YOU ARE NOT ELIGIABLE");
	 }
	 
	} 
	 
	 

}
