package BasicJava1;
import java.io.*;

public class fahrenheitToCelsiusifelse {
    public static void main(String[] args) throws IOException {
        double f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the temperature in Fahrenheit: ");
        f = Double.parseDouble(br.readLine());
        double celsius = (f - 32) * 5.0 / 9.0;
        System.out.println("CONVERT TEMPERATURE TO CELSIUS = " + celsius);
    }
}
