package BasicJava;

import java.io.*;

class Sample {

    // Overloading
    void par(int n) {
        int result = 0;
        int remainder;
        int m = n;

        while (n > 0) {
            remainder = n % 10;
            result = result * 10 + remainder;
            n = n / 10;
        }

        if (m == result) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    void par(float r) {
        if (r % 10 == 7 || r % 7 == 0) {
            System.out.println("It is a buzz number");
        } else {
            System.out.println("It is not a buzz number");
        }
    }
}

public class All {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number for palindrome check:");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Enter a number for buzz number check:");
        float v = Float.parseFloat(br.readLine());

        Sample obj = new Sample();
        obj.par(b);
        obj.par(v);
    }
}
