package BasicJava;
import java.io.*;
public class salary {
	
	      public static void main(String[]args) throws IOException
	       {
	         double a,ince,salary;
	         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	          System.out.println("enter the three number");
	           a=Double.parseDouble(br.readLine());
	           
	            
	            if((a>=50000) &&(a<80000))
	             {
	                ince=(a*5)/100; 
	                 salary=12000;   
	              }
	            else if ((a>=80000) &&(a<100000))
	               {
	                   ince=(a*7)/100; 
	                   salary=12000;
	                 }
	              else if ((a>=100000) &&(a<150000))
	                 {
	                    ince=(a*10)/100; 
	                    salary=12000;
	                   }
	                else if ((a>=150000) &&(a<200000))
	               {
	                   ince=(a*15)/100; 
	                    salary=12000;
	                 }
	                else if (a>=200000)
	               {
	                   ince=(a*20)/100; 
	                   salary=12000;
	                 }
			else
			{
	                  ince=0;
	                  salary=0;
	                  System.out.println("sale amount="+a);
	                   System.out.println("incentive"+ince);
	                   System.out.println("final salary="+(salary+ince));  
			}
	            }
	     }


