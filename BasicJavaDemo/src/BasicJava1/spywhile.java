package BasicJava1;
import java.io.*;

public class spywhile {

	
	
	          public static void main(String[]args)  throws IOException
	           {
	             int n,result=0,remainder,m,product=1;
	               BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	                  System.out.println("enter the value");
	                 n=Integer.parseInt(br.readLine());
	                    m=n;
	                    while(n>0)
	                      {
	                        remainder=n%10;
	                        result=result+remainder;
	                        product =product*remainder ;
	                        n=n/10;  
	                        }  
	                          if (result==product)
	                          {
	                             System.out.println("it is spy number"+m);
	                           }
	                          else
	                           {
	                              System.out.println("it is not spy number"+m);
	                            }      
	                   
	                       }
	              }
