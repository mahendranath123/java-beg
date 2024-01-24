package BasicJava1;
import java.io.*;

public class GiftShop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Gift Shop!");
        System.out.print("Enter the total amount of your shopping: ");

        int shoppingAmount = Integer.parseInt(br.readLine());

        if (shoppingAmount < 0) {
            System.out.println("Invalid amount. Please enter a valid amount.");
        } else {
            String gift = "";
            int discount = 0;

            if (shoppingAmount > 2000 && shoppingAmount <= 5000) {
                gift = "Calculator";
                discount = (shoppingAmount * 5) / 100;
            } else if (shoppingAmount > 5000 && shoppingAmount <= 10000) {
                gift = "School Bag";
                discount = (shoppingAmount * 10) / 100;
            } else if (shoppingAmount > 10000 && shoppingAmount <= 20000) {
                gift = "Wall Clock";
                discount = (shoppingAmount * 15) / 100;
            } else if (shoppingAmount > 20000) {
                gift = "Wrist Watch";
                discount = (shoppingAmount * 20) / 100;
            }

            System.out.println("Shopping amount: $" + shoppingAmount);
            System.out.println("Discount amount: $" + discount);
            System.out.println("Gift you got: " + gift);
            System.out.println("Final bill amount: $" + (shoppingAmount - discount));
        }
    }
}
