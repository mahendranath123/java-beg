package BasicJava1;
import java.io.*;

public class functionmenudrivencirclesquare {

    void circlePerimeter(int r) {
        System.out.println("Perimeter of circle = " + (2 * 3.14 * r));
    }

    void squareArea(int a) {
        System.out.println("Area of square = " + (a * a));
    }

    void rectangleArea(int l, int b) {
        System.out.println("Area of rectangle = " + (l * b));
    }

    public static void main(String[] args) throws IOException {
        int x, y, z;
        String choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        functionmenudrivencirclesquare obj = new functionmenudrivencirclesquare();
        
        do {
            System.out.println("\n1 for perimeter of circle\n2 for area of square\n3 for area of rectangle");
            z = Integer.parseInt(br.readLine());

            switch (z) {
                case 1:
                    System.out.println("Enter the radius of the circle");
                    x = Integer.parseInt(br.readLine());
                    obj.circlePerimeter(x);
                    break;
                case 2:
                    System.out.println("Enter the side length of the square");
                    x = Integer.parseInt(br.readLine());
                    obj.squareArea(x);
                    break;
                case 3:
                    System.out.println("Enter the length and width of the rectangle");
                    x = Integer.parseInt(br.readLine());
                    y = Integer.parseInt(br.readLine());
                    obj.rectangleArea(x, y);
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
            
            System.out.println("\nDo you want to perform another calculation? (y/n): ");
            choice = br.readLine();
        } while (choice.equals("y"));

        System.out.println("Thank you for using the Calculation System!");
    } 
}
