package BasicJava;
import java.io.*;

class MenuDrivenProgram {
    public static void main(String[] args) throws IOException {
        int choice;
        String ch;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("\n1 for composite number\n2 for Smallest integer number\n3 to Exit");

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                // (Previous cases...)
            case 1:
                System.out.println("Enter a number:");
                int n = Integer.parseInt(br.readLine());

                boolean isComposite = false;

                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        isComposite = true;
                        break;
                    }
                }

                if (isComposite) {
                    System.out.println(n + " is a composite number");
                } else {
                    System.out.println(n + " is not a composite number");
                }
                break;


                case 2:
                    System.out.println("Enter an integer:");
                    int number = Integer.parseInt(br.readLine());

                    // Initialize i with the first digit of the number
                    int smallestDigit = number % 10;

                    while (number > 0) {
                        int digit = number % 10;

                        if (digit < smallestDigit) {
                            smallestDigit = digit;
                        }

                        number /= 10;
                    }

                    System.out.println("Smallest digit is: " + smallestDigit);
                    break;

                // (Remaining cases...)

                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-3).");
            }

            System.out.println("Do you want to continue? (Y/N)");
            ch = br.readLine();
        } while (ch.equalsIgnoreCase("y"));
    }
}
