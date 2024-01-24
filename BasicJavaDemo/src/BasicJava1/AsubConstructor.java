package BasicJava1;

import java.io.*;

class AsubConstructor {

    AsubConstructor(int a, int b) {
        System.out.println("Addition=" + (a + b));
    }

    AsubConstructor(float x, float y) {
        System.out.println("Subtraction=" + (x - y));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());

        float m = Float.parseFloat(br.readLine());
        float n = Float.parseFloat(br.readLine());

        AsubConstructor obj = new AsubConstructor(p, q);
        AsubConstructor obj1 = new AsubConstructor(m, n);
    }
}
