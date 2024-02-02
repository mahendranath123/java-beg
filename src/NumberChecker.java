import java.io.*;

class NumberChecker {
    long number;
    String ch;

    NumberChecker() {
        System.out.println("Enter a number ");
        // You can initialize 'number' or 'ch' here if needed
    }

    NumberChecker(long num) {
        System.out.println("Enter a number");
        // You can initialize 'number' or 'ch' here if needed
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n 1 for buzz number \n 2 for Automorphic number \n 3 for exit");
        System.out.println("Enter your choice:");

        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                System.out.println("Enter a number:");
                long buzzNumber = Long.parseLong(br.readLine());
                System.out.println(buzzNumber % 7 == 0 || buzzNumber % 10 == 7 ? "Buzz Number" : "Not a Buzz Number");
                break;

            case 2:
                System.out.println("Enter a number:");
                long automorphicNumber = Long.parseLong(br.readLine());

                // Automorphic logic
                long sq = automorphicNumber * automorphicNumber;
                int count = 1;
                long tempN = automorphicNumber;

                while (tempN > 0) {
                    count *= 10;
                    tempN /= 10;
                }

                if (sq % count == automorphicNumber) {
                    System.out.println("Automorphic Number");
                } else {
                    System.out.println("Not an Automorphic Number");
                }
                break;

            case 3:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please enter a valid option (1-3).");
        }
    }
}
