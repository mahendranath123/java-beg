package BasicJava1;
import java.io.*;

public class forloopDescendingOrder {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the natural number");
        n = Integer.parseInt(br.readLine());

        // Start from n and iterate down to 1 for descending order using a for loop
        for (int i = n; i >= 1; i--) {
            System.out.println("i=" + i);
        }
    }
}
