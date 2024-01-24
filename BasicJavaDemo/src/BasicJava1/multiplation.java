package BasicJava1;
import java.io.*;


public class multiplation 
{

	public static void main(String[] args) throws IOException 
	{
		int n,m,rem=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number 1 ");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter a number 2 ");
		m=Integer.parseInt(br.readLine());
		
		while(m!=0) 
		{
			rem=rem+n;
			m--;
		}
		
		System.out.println("mltiplation is = "+ rem );
		
		
		
		
		

	}

}
