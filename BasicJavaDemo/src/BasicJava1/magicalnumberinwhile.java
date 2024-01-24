package BasicJava1;
import java.io.*;
public class magicalnumberinwhile {
	
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
	                          if (m==(result+product))
	                          {
	                             System.out.println("it is magical number="+m);
	                             
	                           }  
	                          else
	                           {
	                              System.out.println("it is not magical number ="+m);
	                            }      
	                   
	                       }
	              }

