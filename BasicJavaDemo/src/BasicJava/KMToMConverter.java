package BasicJava;
import java.io.*;


public class KMToMConverter 
{
	
    public static void main(String[] args) throws IOException 
    {
    	double f;
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter distance in kilometers (KM): ");
             f = Double.parseDouble(br.readLine());
             double kmValue = Double.parseDouble(br.readLine());

             double metersValue = kmValue * 1000;

             System.out.println(kmValue + " kilometers is equal to " + metersValue + " meters.");
            
        } 
            
    }

