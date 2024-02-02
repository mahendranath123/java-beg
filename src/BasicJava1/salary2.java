package BasicJava1;
import java.io.*;
public class salary2 {

	
	      public static void main(String[]args) throws IOException
	       {
	         int a;
	         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	          System.out.println("enter the three number");
	           a=Integer.parseInt(br.readLine());
	           if((a>=50000) &&(a<80000))
	             {
	                 System.out.println("your salary will be 12000"); 
	              }
	            else if ((a>=80000) &&(a<100000))
	               {
	                   System.out.println("your salary will be 150000");
	                 }
	              else if ((a>=100000) &&(a<150000))
	                 {
	                     System.out.println("your salary will be 200000");
	                   }
	                else if ((a>=150000) &&(a<2000000))
	               {
	                   System.out.println("your salary will be 350000");
	                 }
	                else if (a>=200000)
	               {
	                   System.out.println("your salary will be 50000");
	                 }
			else
			{
	                   System.out.println("your salary will be 0");
			}
	            }
	     }
