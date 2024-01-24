package BasicJava1;
import java.io.*;
public class circledowhile {
	
	
	
	    
	          public static void main(String[]args)  throws IOException
	           {
	             Double r;
	              String c; 
	               BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	                  do{

	                  System.out.println("enter the value");
	                  r=Double.parseDouble(br.readLine());
	                  System.out.println("Area of circle="+(3.14*r*r));
	                   System.out.println("do you want to continue y/n"); 
	                    c=br.readLine();
	                  }
	                   while (c.equals("y") || c.equals("Y"));
	                 }
	            }   
	  


