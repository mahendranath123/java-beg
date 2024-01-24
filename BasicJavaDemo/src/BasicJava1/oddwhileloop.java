package BasicJava1;
import java.io.*;
public class oddwhileloop {
	
	
	public static void main(String[]args)throws  IOException
	{
		int n,k;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter a number=");
		n=Integer.parseInt(br.readLine());
		if (n%2==0)
		{
			k=n;
			while (k>0)
			{
				System.out.println(k);
				k=k-2;
						
			}
			while (k>0)
			{
				System.out.println(k);
				k=k+2;
						
			}
			
			
		}
	}

}
