package BasicJava1;
import java.io.*;
public class nested3 {
	
	
	public static void main(String[]args) throws IOException 
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a,b,c;
	System.out.println("Enter 3 number");
	a=Integer.parseInt (br.readLine());
	b=Integer.parseInt (br.readLine());
	c=Integer.parseInt (br.readLine());
	if (a>b)
	{
	if(a>c)
	{
	System.out.println(a+"greater than" +b+ "&" +c);
	}
	}
	else
	{
	System.out.println(c+"is greater than" +a+ "&" +b);
	}
	{
	if(b>a)
	{
	if(b>c)
	{
	System.out.println(b+"is greater than"+ a+"&"+c);
	}
	else
	{
	System.out.println(c+"is greater than"+ b+ "&"+c);
	}
	}
	}
	}
	}


