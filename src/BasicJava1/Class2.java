package BasicJava1;

 class Class2 {
    int a; 
    int b; 

    class SampleDemo {
        void main() {
            Class2 obj = new Class2();
            obj.a = 10;
            obj.b = 20;
            System.out.println("Enter a number = " + (obj.a + obj.b));
        }
    }

    public static void main(String[] args) {
        
        Class2 Obj = new Class2();
        SampleDemo Obj1 = Obj.new SampleDemo();
        Obj1.main();
    }
}
