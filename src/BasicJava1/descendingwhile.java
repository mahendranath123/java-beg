package BasicJava1;
import java.io.*;
public class descendingwhile {
	
	           public static void main(String[]args) throws IOException
	           {
	             int n;
	              BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
	                System.out.println("Enter the natural number"); 
	                  n=Integer.parseInt(br.readLine());
	                    while (n>0)
	                        {
	                                System.out.println("n="+n);
	                                  n--;
	                                
	                           } 
	                  }
	             }
