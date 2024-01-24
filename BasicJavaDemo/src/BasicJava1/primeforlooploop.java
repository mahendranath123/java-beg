package BasicJava1;
import java.io.*;

public class primeforlooploop {

    public static void main(String[] args) throws IOException {
        int c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) 
            {
                c++;
                
            }
        }
        
        if (c > 0) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is a prime number");
        }
}
}
