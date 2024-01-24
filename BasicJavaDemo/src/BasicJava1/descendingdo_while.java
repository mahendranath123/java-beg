package BasicJava1;
import java.io.*;
public class descendingdo_while {
	
	          public static void main(String[]args)  throws IOException
	           {
	             int n;
	               BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	                  System.out.println("enter the value");
	                  n=Integer.parseInt(br.readLine());
	                   do
	                    {
	                      System.out.println("n="+n);
	                        n--;
	                         }
	                          while(n>0);
	                         System.out.println("descending number"+n) ;
	                       }
	              }


