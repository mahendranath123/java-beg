package BasicJava1;

import java.io.*;

class Areaconstructor {
    Areaconstructor(int a, int b) {
        System.out.println("Area of rectangle=" + (a * b));
    }

    Areaconstructor(int x) {
        System.out.println("Area of circle=" + (3.14 * x * x));
    }

    Areaconstructor(float y, float z) {
        System.out.println("Area of triangle=" + (0.5 * y * z));
    }
}

class Asconstructor1 {
    public static void main(String[] args) throws IOException {
        int p, q,m;
        float v, r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers for rectangle area calculation:");
        p = Integer.parseInt(br.readLine());
        q = Integer.parseInt(br.readLine());
        Areaconstructor obj = new Areaconstructor(p, q);

        System.out.println("Enter the radius for circle area calculation:");
        m = Integer .parseInt(br.readLine());
        Areaconstructor obj1 = new Areaconstructor(m);

        System.out.println("Enter base and height for triangle area calculation:");
        v = Float.parseFloat(br.readLine());
        r = Float.parseFloat(br.readLine());
        Areaconstructor obj2 = new Areaconstructor(v, r);
    }
}
