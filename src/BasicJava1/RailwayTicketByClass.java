package BasicJava1;
import java.io.*;

 class RailwayTicketByClass {
    int totalAmt, fix = 250, total;
    String name, coach;
    long mobno;

    void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Railway Ticket Booking System!");
        System.out.println("Please enter your information:");

        System.out.println("Enter your Name: ");
        name = br.readLine();

        System.out.println("Select coach: 1 for First AC, 2 for Second, 3 for Third AC, 4 for Sleeper");
        System.out.println("Enter coach number: ");
        coach = br.readLine();

        System.out.print("Enter your mobile number: ");
        mobno = Long.parseLong(br.readLine());
    }

    void update() {
        if (coach.equals("1")) {
            coach = "First AC";
            total = fix + 700;
        } else if (coach.equals("2")) {
            coach = "Second";
            total = fix + 500;
        } else if (coach.equals("3")) {
            coach = "Third AC";
            total = fix + 250;
        } else {
            coach = "Sleeper";
            total = fix;
        }
    }

    void display() {
        System.out.println("\nTicket Details:");
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Total Amount: " + total);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice = "y"; // Initialize choice with "y" to enter the loop

        while (choice.equals("y")) {
            RailwayTicketByClass obj = new RailwayTicketByClass();
            obj.accept();
            obj.update();
            obj.display();

            System.out.println("\nDo you want to book another ticket? (y/n): ");
            choice = br.readLine();
        }

        System.out.println("Thank you for using the Railway Ticket Booking System!");
    }
}
