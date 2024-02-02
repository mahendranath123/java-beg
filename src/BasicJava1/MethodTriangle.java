package BasicJava1;
import java.io.*;

public class MethodTriangle {

    void calculateTriangleArea(float base, float height) {
        float area = 0.5f * base * height;
        System.out.println("Area of the triangle with base " + base + " and height " + height + " is " + area);
    }

    public static void main(String[] args) throws IOException {
        float base, height;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the base of the triangle: ");
        base = Float.parseFloat(br.readLine());
        System.out.println("Enter the height of the triangle: ");
        height = Float.parseFloat(br.readLine());

        MethodTriangle obj = new MethodTriangle();
        obj.calculateTriangleArea(base, height);
    }
}
