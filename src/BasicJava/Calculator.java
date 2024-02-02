package BasicJava;
import java.util.Scanner;
public class Calculator
{

	public static void main(String[]args)
	  {
         String yn;
		 do
		 {
			 Scanner s= new Scanner(System.in);
			 System.out.println("Enter the First number");
			 int no1=s.nextInt();
			 System.out.println("Enter the Second number");
			 int no2=s.nextInt();
			 System.out.println("Select the Symbol(+,-,*,/)");
			  String sym=s.next();
			  int res ;
			  switch(sym)
			  {
			  case"+":res=no1+no2;
			          System.out.println("Addition is :"+res);
			          break;
			  case"-":res=no1-no2;
	          System.out.println("Subtraction is :"+res);
	                  break; 
			  case"*":res=no1*no2;
	          System.out.println("Multiplication is :"+res);                      
	                   break;
			  case"/":res=no1/no2;
	          System.out.println("Divison is :"+res);
	                  break;
	          default :System.out.println("Invalid symbol");
	                   break;
			  }
		 System.out.println("Do you continue (press y for Yes or n for No)");
        
		  yn=s.next();
		 }
		 
         while(yn.equals("y")||yn.equals("Y"));
		 
		 
	  }
  
	
	    
}
