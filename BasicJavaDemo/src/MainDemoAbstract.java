abstract class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void output() {
        System.out.println("Child class");
    }
}

class MainDemoAbstract {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
