package BasicJava1;
import java.io.*;
public class leapyearifelse {
	
	public static void main (String[]args)throws IOException
	{
		int year;
		BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a year");
		year=Integer.parseInt(br.readLine());
		if((year%400==0)||(year%4==0&&year%100!=0))
		 {
	      System.out.println("it is a leap");
		 }
       else
   {
	 System.out.println("it is not a leap");
   }
		 
     }

	}


