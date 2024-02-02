package BasicJava1;
import java.io.*;
public class nestedavg {
	
	      public static void main(String[]args) throws IOException
	       {
	         int a,b,c,total,avg;
	         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	          System.out.println("enter the three number");
	           a=Integer.parseInt(br.readLine());
	           b=Integer.parseInt(br.readLine());
	           c=Integer.parseInt(br.readLine());
	           total=(a+b+c);
	            avg=(total/3);
	            if ((avg>=60)&&(avg<75))
	              {
	                    System.out.println("first classs");
	               } 
	             else if ((avg>=75)&&(avg<90))
	                {
	                    System.out.println("Disttion");
	                 }
	               else if ((avg>=90)&&(avg<100))
	                {
	                    System.out.println("merit");
	                 }
	                else if ((avg>=40)&&(avg<60))
	                {
	                    System.out.println("Second");
	                 } 
	                  else
	                   {
	                    System.out.println("fail");
	                     }
	            }
	   }



