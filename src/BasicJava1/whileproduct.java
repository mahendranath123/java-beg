package BasicJava1;
import java.io.*;
public class whileproduct {

	
	
	          public static void main(String[]args)  throws IOException
	           {
	             int n,result=1,remainder;
	               BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	                  System.out.println("enter the value");
	                 n=Integer.parseInt(br.readLine());
	                    
	                    while(n>0)
	                      {
	                        remainder=n%10;
	                        result=result*remainder;
	                         n=n/10;  
	                        }
	                         System.out.println("the value"+result);      
	                   
	                       }
	              }
