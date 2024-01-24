package BasicJava1;
import java.io.*;

import javax.print.DocFlavor.STRING;
public class menudeivenweekend {
	
	public static void main (String[]args)throws IOException
	{
		int a;
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter the day number");
		a=Integer.parseInt(br.readLine());
		
		
		String day ;
		
		switch (a)
		{
			case 1:
				day="monday";
			break;
			 
			case 2:
				day="tuesday";
			break;
			
			case 3:
				day="wednesday";
			break;
			
			case 4:
				day="Thurday";
			break;
			
			case 5:
				day="Friday";
			break;
			
			case 6:
				day="saturday";
			break;
			
			case 7:
				day="sunday";
			break;
			
			default:
				day="Invalid number";
				
		}
		System.out.println("The number of day "+day);
				
			
			
		}
			
	}


