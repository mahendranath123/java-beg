package BasicJava1;

abstract class begiabs {
    abstract void output();

    void show() {
        System.out.println("hey");
    }
}

class gam extends begiabs {
    void output() {
        System.out.println("good morning");
    }
}

class demo {
    public static void main(String[] args) {
        
        gam br = new gam();
        
       
        br.output();
        br.show();
    }
}
