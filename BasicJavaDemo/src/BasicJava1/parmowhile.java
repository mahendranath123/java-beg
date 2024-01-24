package BasicJava1;
import java.io.*;
public class parmowhile {
	

        public static void main(String[]args)throws IOException
        {
           BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            int n,result=0,remainder,m;
              System.out.println("enter the value");
              n=Integer.parseInt(br.readLine());
                m=n;
                while(n>0)
                  {
                    remainder=n%10;
                    result=result*10+remainder;
                     n=n/10;    
                    }
                     System.out.println("Reverse of given no="+result);
                           
                      if(m==result)
                       {
                         System.out.println("It is palindrome");
                        }
                       else
                        {
                          System.out.println("it is not palindrome");
                          } 
                }
        }


