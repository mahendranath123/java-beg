package BasicJava1;
import java.io.*;
public class productfirst10naturalnowhileloop {
	
	public static void main (String[]args)throws IOException
	{
		int n,prod =1;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter a number");
		n=Integer.parseInt(br.readLine());
		while (n>0)
		{
			prod=prod*n;
			n--;
			System.out.println("product of first natural number = "+prod);
		}
	}   

}
