package BasicJava;

import java.io.*;


public class RectangleAreaCalculator {
    public static void main(String[] args) throws IOException {
    	
    	double length,width;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the length of the rectangle: ");
         length = Double.parseDouble(reader.readLine());

        System.out.println("Enter the width of the rectangle: ");
         width = Double.parseDouble(reader.readLine());

        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
        
        
    }
}

	


