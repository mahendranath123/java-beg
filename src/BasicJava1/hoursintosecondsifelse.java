package BasicJava1;
import java.io.*;
public class hoursintosecondsifelse {
	
	
	    public static void main(String[] args) throws IOException 
	    {
	        double hours;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the number of hours: ");
	        hours = Double.parseDouble(br.readLine());

	        double seconds = hours /3600; // There are 3600 seconds in an hour
	        
	        System.out.println("Converted to seconds: " + seconds);
	    }
	}



