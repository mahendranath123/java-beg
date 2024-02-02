package BasicJava1;

import java.io.*;

class Practice {
    public static void main(String[] args) throws IOException {
        int original, remainder, result = 0, n = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input the number
        System.out.println("Enter a number: ");
        original = Integer.parseInt(br.readLine());

        // Store the original number in a temporary variable
        int temp = original;

        // Count the number of digits using a for loop
        for (n = 0; temp != 0; temp /= 10, n++);

        temp = original; // Reset temp to the original number

        // Calculate the Armstrong number using a for loop
        for (; temp != 0; temp /= 10) {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
        }

        // Check if the number is an Armstrong number
        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

 
       
       