package BasicJava1;

 class constructorsample {
    int a ,b ; 

    class SampleDemo {
       void innerMain() {
            constructorsample obj = new constructorsample();
            obj.a = 10;
            obj.b = 20;
            System.out.println("Enter a number = " + (obj.a + obj.b));
        }
    }

    public static void main(String[] args) {
        constructorsample outerObj = new constructorsample();
        SampleDemo innerObj = outerObj.new SampleDemo();
        innerObj.innerMain(); 
}

}