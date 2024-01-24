package BasicJava;
import java.io.*;
public class endwith7ornot {
	  public static void main(String[]args)throws IOException
	  {
		  int a;
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("enter the number");
		  a=Integer.parseInt(br.readLine());
		  if(a%10==7)
		  {
			  System.out.println("entered number is ended by 7");
			 
		  }
		  else
		  {
			  System.out.println("entered number is not ended by 7");
		  }
	  }

}
