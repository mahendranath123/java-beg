package BasicJava1;
import java.io.*;

public class MethodCircle {

    void calculateCircleArea(int r) {
        double area = 3.14 * r * r;
        System.out.println("Area of the circle with radius " + r + " is " + area);
    }

    public static void main(String[] args) throws IOException {
        int r;
        String ch;
        do {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius of the circle: ");
        r = Integer.parseInt(br.readLine());

        MethodCircle obj = new MethodCircle();
        obj.calculateCircleArea(r);
        System.out.println("do you to continue  y or n");
        ch=br.readLine();
    } while (ch.equalsIgnoreCase("Y")); 
} 
}    
