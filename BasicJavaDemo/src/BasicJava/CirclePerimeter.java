package BasicJava;


import java.io.*;


public class CirclePerimeter 
{
    public static void main(String[] args) throws IOException 
    {
    	
    	double a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius of the circle: ");
         a = Double.parseDouble(br.readLine());
         
        System.out.println("The perimeter of the circle is =" +( 2*314));
    }
}
