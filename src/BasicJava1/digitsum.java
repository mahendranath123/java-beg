package BasicJava1;
import java.io.*;

class digitsum {
    

	public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n , x = 0, r;
        

        System.out.println("Enter number:- ");
        n = Integer.parseInt(br.readLine());
        
        while (n > 0) {
            r = n % 10;  // Extract the last digit of the number
            x = x + r;   // Add the last digit to the sum
            n = n / 10;  // Remove the last digit from the number
        }

        System.out.println("Sum of digits= " + x);
    }
}
