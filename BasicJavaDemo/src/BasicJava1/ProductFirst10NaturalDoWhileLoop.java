package BasicJava1;
import java.io.*;

public class ProductFirst10NaturalDoWhileLoop {
    public static void main(String[] args) throws IOException {
        int n, prod = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Enter a number");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

        do {
            prod = prod * n;
            n--;
            System.out.println("Product of the first natural numbers = " + prod);
        } while (n > 0);
        	}
    }

