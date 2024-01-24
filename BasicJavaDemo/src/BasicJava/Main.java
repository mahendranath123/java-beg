package BasicJava;

class Practice {
    void show() {
        // Overriding
        System.out.println("1");
    }
}

class Fr extends Practice {
    void show() {
        System.out.println("2");
    }
}

public class Main {
    public static void main(String[] args) {
        Fr t = new Fr();
        t.show();

        Practice y = new Practice();
        y.show();
    }
}
