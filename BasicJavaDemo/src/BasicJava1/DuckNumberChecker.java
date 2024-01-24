package BasicJava1;
import java.io.*;

public class DuckNumberChecker {


	    
	    static boolean isDuck(String number) 
	{
	        // Check if the number has zero(s) and does not start with zero
	        return number.contains("0") && number.charAt(0) != '0';
	    }

	    public static void main(String[] args) throws IOException 
	   {
	       BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 

	        // Input from the user
	        System.out.println("Enter a number: ");
	        String user = br.readLine();

	        // Check if the entered number is a Duck Number
	        if (isDuck(user)) {
	            System.out.println(user+ " is a Duck Number.");
	        } else {
	            System.out.println(user+ " is not a Duck Number.");
	        }

	        
       }
	}
