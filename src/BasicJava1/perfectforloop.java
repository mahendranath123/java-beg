package BasicJava1;
import java.io.*;

public class perfectforloop {

    public static void main(String[] args) throws IOException {
        int n, i, sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Add the missing closing parenthesis here

        System.out.println("Enter the number");
        n = Integer.parseInt(br.readLine());

        for (i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }
}
