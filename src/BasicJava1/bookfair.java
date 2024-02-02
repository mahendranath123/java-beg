package BasicJava1;
import java.io.*;

public class bookfair {
    String name;
    double price;

    // Method to input book details
    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name of the book: ");
        name = br.readLine();
        System.out.print("Enter price of the book: ");
        price = Double.parseDouble(br.readLine());
    }

    // Method to calculate discounts based on the price
    void calculate() {
        double discount = 0.0;

        if (price <= 1000) {
            discount = 0.02 * price; // 2% discount
        } else if (price > 1000 && price <= 3000) {
            discount = 0.1 * price; // 10% discount
        } else {
            discount = 0.15 * price; // 15% discount
        }

        price = price - discount;
    }

    // Method to display book details
    void display() {
        System.out.println("Name of book: " + name);
        System.out.println("Price of book: " + price);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Book Store");

        bookfair obj = new bookfair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
