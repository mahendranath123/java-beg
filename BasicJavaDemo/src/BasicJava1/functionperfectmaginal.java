package BasicJava1;
import java.io.*;
public class functionperfectmaginal {
	
	
	class Methodcircle
	  {
	            void Circle (int r)
	             {
	                System.out.println("Addition of two Number="+(3.14*r*r));
	               }
	                 public static void main(String[]args) throws IOException
	                   {
	                     int r;
	                      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	                       System.out.println("Enter two number");
	                        r=Integer.parseInt(br.readLine());
	                       
	                         Methodcircle obj = new  Methodcircle();
	                   
	                           obj.Circle(r);
	                          }
	                }


}
