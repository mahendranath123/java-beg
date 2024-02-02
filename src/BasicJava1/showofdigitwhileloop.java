package BasicJava1;
import java.io.*;
public class showofdigitwhileloop {
	
	public static void main (String[]args)throws IOException
	{
		int i=0,j,sum=0;
		
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter a number");
		
		j=Integer.parseInt(br.readLine());
         while (i<=j)
         {
        	
        	 sum=sum+i;
        	 
        	
        	 i++;
         }
         System.out.println("the sum of digit is = "+sum);
	}

}
