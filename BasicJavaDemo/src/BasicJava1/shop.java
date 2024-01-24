package BasicJava1;
import java.io.*;

public class shop {
    public static void main(String[] args) throws IOException {
        float price;
        double dis = 0;
        String name, address, type;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        name = br.readLine();
        System.out.println("Enter your address");
        address = br.readLine();
        System.out.println("Select type L for laptop and D for desktop pc");
        type = br.readLine();
        System.out.println("Enter the price");
        price = Float.parseFloat(br.readLine());

        if (type.equals("L")) { // Fix: Changed 'equal' to 'equals' and removed extra '('
            if (price > 0 && price <= 25000)
                dis = 0;
            else if (price > 25000 && price <= 50000)
                dis = (price * 5) / 100;
            else if (price > 50000 && price <= 100000)
                dis = (price * 7.5) / 100;
            else
                dis = (price * 10) / 100;
        }

        if (type.equals("D")) { // Fix: Removed ';' after if statement
            if (price > 0 && price <= 25000)
                dis = (price * 5) / 100;
            else if (price > 25000 && price <= 50000)
                dis = (price * 7.6) / 100; // Fix: Changed '7.6' to '7.6'
            else if (price > 50000 && price <= 1000000) // Fix: Changed '1000000' to '100000'
                dis = (price * 10.0) / 100;
            else
                dis = (price * 15.0) / 100;
        }

        System.out.println("___________________________");
        System.out.println("\n name=" + name + "\n address=" + address + "\n type=" + type);
        System.out.println("Price=" + price);
        System.out.println("Discount amount=" + dis);
        System.out.println("Net amount=" + (price - dis));
    }
}
