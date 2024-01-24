package BasicJava1;



class Test {
	 
	 void ak()
	 {
	 System.out.println("parent class");

    }
 }
 class Test1 extends Test
 {
	 void ak()
	 {
		 System.out.println("child class");
	 }
 public static void main (String[]args)
 {
	 Test test=new Test();
	 test.ak();
	 
	 Test1 t=new Test1();
	 t.ak();
	 
 }
 }
