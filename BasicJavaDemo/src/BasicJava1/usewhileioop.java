package BasicJava1;
import java.io.*;
public class usewhileioop {
	
	           public static void main(String[]args) throws IOException
	           {
	             int i=1,n;
	              BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
	                System.out.println("Enter the natural number"); 
	                  n=Integer.parseInt(br.readLine());
	                    while (i<=n)
	                        {
	                                System.out.println("i="+i);
	                                  i++;
	                                
	                           } 
	                  }
	             }


