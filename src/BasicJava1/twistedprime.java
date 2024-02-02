package BasicJava1;
import java.io.*;


public class twistedprime {

	public static void main(String[] args) throws  IOException {
		int c = 0, result=0,remainder;;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) 
            {
                c++;
                
            }
        }
        if (c > 0) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is a prime number");
        }
        
       
      while(n>0)
      {
    	 
          
           
            while(n>0)
              {
                remainder=n%10;
                result=result*10+remainder;
                 n=n/10;    
                }
         }
      
	      System.out.println("reversed number = "+result);

	
	
	 for(int i = 2; i <= result / 2; i++) {
        if (result % i == 0) 
        {
            c++;
            
        }
    }
    if (c > 0) {
        System.out.println( result+ " is not a prime number");
    } else {
        System.out.println( result+" is a prime number");
    }
	}
}


