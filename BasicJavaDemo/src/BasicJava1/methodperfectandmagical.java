package BasicJava1;
import java.io.*;

public class methodperfectandmagical {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int choice, num;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check for Perfect Number");
            System.out.println("2. Check for Magic Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check for Perfect Number: ");
                    num = Integer.parseInt(br.readLine());
                    perfect(num);
                    break;

                case 2:
                    System.out.print("Enter a number to check for Magic Number: ");
                    num = Integer.parseInt(br.readLine());
                    magic(num);
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        } while (choice != 3);
 
    }

    }

