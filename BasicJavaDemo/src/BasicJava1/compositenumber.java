package BasicJava1;

import java.io.*;

public class compositenumber {

    public static void main(String[] args) throws IOException {

        int n, i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        n = Integer.parseInt(br.readLine());

        for (i = 2; i <= n / 2; i++) {
            // If n is divisible evenly by i, it is a composite number
            if (n % i == 0) {
                System.out.println("It is a composite number");
                break; // Exit the loop once a divisor is found
            }
        }

        if (i > n / 2) {
            System.out.println("It is not a composite number");
        }
    }
}
