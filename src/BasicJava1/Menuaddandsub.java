package BasicJava1;
import java.io.*;

public class Menuaddandsub {
    void Addition(int a, int b) {
        System.out.println("Addition=" + (a + b));
    }

    void subtraction(int a, int b) {
        System.out.println("Subtraction=" + (a - b));
    }

    void multiplication(int a, int b) {
        System.out.println("Multiplication=" + (a * b));
    }

    public static void main(String[] args) throws IOException {
        int x, y, z;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Menuaddandsub obj = new Menuaddandsub();

        System.out.println("\n 1 for addition \n 2 for subtraction \n 3 for multiplication");
        z = Integer.parseInt(br.readLine());

        switch (z) {
            case 1:
                System.out.println("Enter two numbers");
                x = Integer.parseInt(br.readLine());
                y = Integer.parseInt(br.readLine());
                obj.Addition(x, y);
                break;

            case 2:
                System.out.println("Enter two numbers");
                x = Integer.parseInt(br.readLine());
                y = Integer.parseInt(br.readLine());
                obj.subtraction(x, y);
                break;

            case 3:
                System.out.println("Enter two numbers");
                x = Integer.parseInt(br.readLine());
                y = Integer.parseInt(br.readLine());
                obj.multiplication(x, y);
                break;

            default:
                System.out.println("Invalid selection");
                break;
        }
    }
}
