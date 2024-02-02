package BasicJava1;
import java.io.*;

public class nested4 {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        if ((a > b) && (a > c)) {
            System.out.println("a is greater than b and c");
        } else if ((b > a) && (b > c)) {
            System.out.println("b is greater than a and c");
        } else if ((c > a) && (c > b)) {
            System.out.println("c is greater than a and b");
        } else {
            System.out.println("All numbers are equal");
        }
    }
}
