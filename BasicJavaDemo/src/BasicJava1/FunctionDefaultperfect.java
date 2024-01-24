package BasicJava1;
import java.io.*;

public class FunctionDefaultperfect {
    void product() throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        System.out.println("Multiplication = " + (a * b * c));
    }

    public static void main(String[] args) throws IOException {
        FunctionDefaultperfect obj = new FunctionDefaultperfect();
        obj.product();
    }
}
