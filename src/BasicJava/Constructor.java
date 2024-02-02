package BasicJava;

import java.io.*;

class Practice {
    
    Practice(int n) {
        int result = 0;
        int remainder;
        int m = n;

        while (n > 0) {
            remainder = n % 10;
            result = result + remainder;
            n = n / 10;
        }

        if (m % result == 0) {
            System.out.println("It is niven number");
        } else {
            System.out.println("It is not niven number");
        }
    }

   Practice(Float a) {
        if (((a - 1) % 9) == 0) {
            System.out.println("It is a magical number");
        } else {
            System.out.println("It is not a magical number");
        }
    }
}

public class Constructor {
    public static void main(String[] args) throws IOException {
        int ne;
		float b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // First input
        System.out.println("Enter a value for ne:");
        ne = Integer.parseInt(br.readLine());
        Practice obj = new Practice(ne);

        // Second input
        System.out.println("Enter a value for b:");
        b = Float.parseFloat(br.readLine());
        Practice obj1 = new Practice(b);
    }
}
