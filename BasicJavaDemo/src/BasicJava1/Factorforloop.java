package BasicJava1;

import java.io.*;

public class Factorforloop {
    public static void main(String[] args) throws IOException {
        int n, i, fac = 1; 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        n = Integer.parseInt(br.readLine());

        for (i = 1; i <= n; i++) {
            fac = fac *i; 
            
        }

        System.out.println("Factorial of " + n + " is: " + fac);
    }
}
