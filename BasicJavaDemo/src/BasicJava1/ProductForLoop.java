package BasicJava1;
import java.io.*;

public class ProductForLoop {
    public static void main(String[] args) throws IOException {
        int n, i, product = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        n = Integer.parseInt(br.readLine());

        for (i = 1; i <= n; i++) 
        {
            product = product * i;
        }

        System.out.println("Product of numbers from 1 to " + product);
    }
}
