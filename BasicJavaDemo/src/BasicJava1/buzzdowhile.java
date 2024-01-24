package BasicJava1;
import java.io.*;

public class buzzdowhile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number;
        System.out.println("Enter a number");
         number = Integer.parseInt(br.readLine());
        
        
        do {
            if (number % 7 == 0 || number % 10 == 0) {
                System.out.println(number);
            }
            number++; 
        } while (number <= 500);
    }
}
