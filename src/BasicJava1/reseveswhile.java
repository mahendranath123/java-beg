package BasicJava1;
import java.io.*;
public class reseveswhile {
	
	            public static void main(String[]args)throws IOException
	            {
	               BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	                int n,result=0,remainder;
	                  System.out.println("enter the value");
	                  n=Integer.parseInt(br.readLine());
	                   
	                    while(n>0)
	                      {
	                        remainder=n%10;
	                        result=result*10+remainder;
	                         n=n/10;    
	                        }
	                         System.out.println("Reverse of given no="+result);
	                               
	                          
	                    }
	            }


