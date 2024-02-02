package BasicJava1;
import java.io.*;
public class menudriven2 {
	
	public static void main(String args[])throws IOException
	{
	int num,a,b;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("1 for Addition \n 2 for Substraction \n 3 for multiplication \n 4 for Division");
	System.out.println("Select any one number between 1 to 4");
	num=Integer.parseInt(br.readLine());
	 switch(num)
	{
	case 1: System.out.println("Enter two number");
	       a=Integer.parseInt(br.readLine());
	       b=Integer.parseInt(br.readLine());
	       System.out.println("Addition"+(a+b));
	break;
	case 2: System.out.println("Enter two number");
	       a=Integer.parseInt(br.readLine());
	       b=Integer.parseInt(br.readLine());
	       System.out.println("Substraction"+(a-b));
	break;
	case 3: System.out.println("Enter two number");
	       a=Integer.parseInt(br.readLine());
	       b=Integer.parseInt(br.readLine());
	        System.out.println("multiplication"+(a*b));
	break;
	case 4: System.out.println("Enter two number");
	       a=Integer.parseInt(br.readLine());
	       b=Integer.parseInt(br.readLine());
	       System.out.println("Division"+(a/b));
	default:
	       System.out.println("Invalid Number");
	}
	}
	}



