import java.io.*;

class A {
    void circleArea(int radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}

class B extends A {
    void triangleArea(float base, float height) {
        System.out.println("Area of triangle: " + (base * height) / 2);
    }
}

class C extends B {
    void rectangleArea(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    @Override
    public void circleArea(int radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }

    // Override the triangleArea method from class B
    @Override
    public void triangleArea(float base, float height) {
        super.triangleArea(base, height);
    }
}
class MultipleInheritance {
    public static void main(String[] args) throws IOException {
        C objC = new C();

        int x, y;
        float g, h;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius value for the circle: ");
        x = Integer.parseInt(br.readLine());
        objC.circleArea(x);

        System.out.println("Enter the base and height for the triangle: ");
        h = Float.parseFloat(br.readLine());
        g = Float.parseFloat(br.readLine());
        objC.triangleArea(h, g);

        System.out.println("Enter the length and breadth for the rectangle: ");
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        objC.rectangleArea(x, y);
    }
}
