import java.io.*;

abstract class OverDemo {
    abstract void output();

    void show() {
        System.out.println("Normal Method");
    }
}

class Demo extends OverDemo {
    void output() {
        System.out.println("Abstract method");
    }

    void print() {
        System.out.println("Child method");
    }
}

public class AbMethodDem {
    public static void main(String[] args) throws IOException {
        Demo obj = new Demo();
        obj.show();
        obj.output();
        obj.print();
    }
}
