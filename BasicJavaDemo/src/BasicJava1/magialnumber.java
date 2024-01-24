package BasicJava1;
import java.io.*;


public class magialnumber {
	
	public static void main (String[]args) throws IOException
	{ 
		int number;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any number to check: ");  
		
		 number= Integer.parseInt(br.readLine()); 
		
		{  
		if( ((number - 1) % 9) == 0) {
			System.out.println(" it is magicalnumber");
			
		}
		
		else  {
			System.out.println("it is not magical  number");
		}
		 
		
		}
	}
	
}
		 
	


