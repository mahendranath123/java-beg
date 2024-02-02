package BasicJava1;
import java.io.*;


public class primenumber {
	 
	public static void main (String[]args) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int t = 0;
		System.out.println("enter a value");
		int n=Integer.parseInt(br.readLine());
		for(int i=2;i<=n-1;i++)
      {
	     if(n%i==0)
	     {
	    	 t=1; 
	     }
	   
      }
		if (t==1)
		{
			System.out.println("it is not prime number  = "+n);
				
		}
		else {
			System.out.println("it is prime number = "+n);
			
		}
		
	}

}
