package BasicJava1;
import java.io.*;

public class multiplicationforloop {

    public static void main(String[] args) throws IOException {
        int n, i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        n = Integer.parseInt(br.readLine());

        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
