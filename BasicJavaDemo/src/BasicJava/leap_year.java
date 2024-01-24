package BasicJava;
import java.util.Scanner;
public class leap_year {
	   
	 public static void main (String[]args)
	 {
		 Scanner s =new Scanner(System.in);
		  System.out.println("enter the number");
		  int year =s.nextInt ();
		// int year =2016 ; (if is use in one number)
		 if((year%400==0) || (year%4==0&&year%100!=0))
				 {
			 System.out.println("it is a leap");
				 }
		 else
		 {
			 System.out.println("it is not a leap");
		 }
				 
	 }
	

}
    

      