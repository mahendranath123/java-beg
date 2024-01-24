package BasicJava1;

import java.io.*;

public class classsample {
    void add(int a, int b) {
        System.out.println("Addition=" + (a + b));
    }

    public static void main(String[] args) throws IOException {
        classsample obj = new classsample();
        int a = 10;
        int b = 20;
        obj.add(a, b);
    }
}
