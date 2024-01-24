package BasicJava;
import java.util.Scanner;
public class even_or_odd_number {
	
	             public static void main(String[]args)
	             {
	            	 Scanner s=new Scanner (System.in);
	            	  System.out.println("enter the number");
	            	  int no=s.nextInt();
	            	  //int no=12;   (if is  number you want)
	            	 if (no%2==0)
	            	 {
	            		 System.out.println("it is even");
	            	 }
	            	 else
	            	 {
	            		 System.out.println("it is odd");
	            	 }
	             }

}
