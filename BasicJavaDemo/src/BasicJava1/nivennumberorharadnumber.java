package BasicJava1;
import java.io.*;
public class nivennumberorharadnumber {
	

	
	          public static void main(String[]args)  throws IOException
	           {
	             int n,result=0,remainder,m;
	               BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	                  System.out.println("enter the value");
	                 n=Integer.parseInt(br.readLine());
	                    m=n;
	                    while(n>0)
	                      {
	                        remainder=n%10;
	                        result=result+remainder;
	                         n=n/10;  
	                        }
	                          if (m%result==0)
	                          {
	                             System.out.println("it is niven number ="+m);
	                           }
	                          else
	                           {
	                              System.out.println("it is not niven number ="+m);
	                            }      
	                   
	                       }
	              }
