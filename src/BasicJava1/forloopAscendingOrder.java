package BasicJava1;
import java.io.*;

public class forloopAscendingOrder {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the natural number");
        n = Integer.parseInt(br.readLine());

        // Start from 1 and iterate up to n for ascending order using a for loop
        for (int i = 1; i <= n; i++) {
            System.out.println("i=" + i);
        }
    }
}
