package BasicJava1;
import java.io.*;
public class user {

	
	      public static void main(String[]args) throws IOException
	       {
	         
	         String UName,pass;
	         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	            System.out.println("enter the userename");
	           UName=br.readLine();
	             System.out.println("enter the password");
	              pass= br.readLine();
	             if (UName.equals(pass))
	              {
	                System.out.println("valid user");
	               }
	              else
	               {
	                   System.out.println("invalid user");
	                }
	         }
	  }
