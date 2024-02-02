package BasicJava1;
import java.io.*;


public class ternary_operator {
	

	    public static void main(String[] args) throws IOException  
	    {
	    	int n;
	      BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	        System.out.print("Enter an integer number: ");
	        n=Integer.parseInt(br.readLine());
	        
	        String result = (n % 2 == 0) ? "Even" : "Odd";
	        System.out.println(n + " is " + result);
	    }
	}

			


