package BasicJava1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PronicNumber {

    // Method to check if the given number is a Pronic number
    static boolean isPronic(int n) {
        int i = 1;
        while (i * (i + 1) <= n) {
            if (i * (i + 1) == n) {
                return true; // Pronic number
            }
            i++;
        }
        return false; // Not a Pronic number
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input a number
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(reader.readLine());

        // Check if the number is a Pronic number
        if (isPronic(num)) {
            System.out.println(num + " is a Pronic number.");
        } else {
            System.out.println(num + " is not a Pronic number.");
        }
    }
}
