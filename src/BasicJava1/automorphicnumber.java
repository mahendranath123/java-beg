package BasicJava1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class automorphicnumber {
	
	
	
	public static void main(String[]args) throws IOException
    {
        int a,sq;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value");
        a=Integer.parseInt(br.readLine());
        sq=a*a;
        if((sq%10==a)||(sq%100==a)||(sq%1000==a))
        {
          System.out.println("it is automorphic number");
        }
       else
        {
          System.out.println("it is not automorphic number");
         }
      }
}


