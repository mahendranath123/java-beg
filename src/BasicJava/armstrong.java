package BasicJava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class armstrong {
	 public static void main(String[]args) throws IOException
	 {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter your number:");
		  int no = Integer.parseInt(br.readLine());
		  int t1=no;
		  int length =0;
		  while(t1 !=0)
		  {
			  length=length+1;
			  t1=t1/10;
		  }
		  int t2=no;
		  int arm=0;
		  int rem;
		  while (t2 !=0)
		  {
			  int mul=1;
			  rem=t2%10;
			  for(int i=1;i<=length;i++)
			  {
				  mul=mul*rem;
			  }
			  arm=arm+mul;
			  t2=t2/10;
		  }
		  if(arm==no)
		  {
			  
			  System.out.println("it is armstrong");
		  }
		  else
		  {
			  System.out.println("it is not a armstrong");
		  }
	 }
	  
	 
	 

}
