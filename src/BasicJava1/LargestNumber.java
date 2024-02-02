package BasicJava1;
import java.io.*;

public class LargestNumber {

    public static void main(String[] args) throws IOException {

        int n, l = 0, r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        n = Integer.parseInt(br.readLine());

        while (n > 0) {
            r = n % 10;
            if (r > l) {
                l = r;
            }
            n = n / 10;
        }
        System.out.println(l + " is the largest digit");
    }
}
