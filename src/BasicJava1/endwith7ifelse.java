package BasicJava1;
import java.io.*;
public class endwith7ifelse {
	
	public static void main (String[]args)throws IOException
	{
	  int end;
	  BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	  System.out.println("enter a  value");
	  end=Integer.parseInt(br.readLine());
	  if (end%10==7)
	  {
		  System.out.println("enter is end by 7="+end);
	  }
	  else 
	  {
		 System.out.println("enter number is not by 7="+end); 
	  }
		  
		  
	}

}
