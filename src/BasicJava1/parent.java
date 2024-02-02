package BasicJava1;

public class parent {

	
	class Parent
	{

	     void Display()
	     {
	         System.out.println("parent class method");
	      }
	   }
	class child extends Parent
	{
	        void show ()
	         {
	            System.out.println("child class method");        
	            }
	       }
	class Inheritdemo
	 {
	         public static void main(String[]args)
	          {
	                child obj =new child();
	                 obj.Display();
	                 obj.show();
	                }
	       }
}
