package BasicJava1;
import java.io.*;

public class nested1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        System.out.println("Enter 3 numbers");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greater than " + b + " and " + c);
            } else {
                System.out.println("c is greater than a and b");
            }
        } else {
            if (b > a) {
                if (b > c) {
                    System.out.print(b + " is greater than " + a + " and " + c);
                } else {
                    System.out.println(c + " is greater than " + a + " and b");
                }
            }
        }
    }
}
