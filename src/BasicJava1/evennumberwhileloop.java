package BasicJava1;
import java.io.*;
public class evennumberwhileloop {
	
	public static void main (String[]args)throws IOException
	{
		int a,k;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter a number");
		a=Integer.parseInt(br.readLine());
		k=2;
			
	     while  (k<=a)
	     {
	    	 System.out.println(k);
	    	 k=k+2;
	     }
			    	  
				
	}

}
