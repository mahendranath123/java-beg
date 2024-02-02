package BasicJava1;
import java.io.*;

public class evennumberforloop {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;

        for (i = 1; i <= 150; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
        }
    }
}
