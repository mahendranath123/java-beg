package BasicJava1;
import java.io.*;
public class functionareaofsphere {

            void area(int r)
            {
            	System.out.println("area of sphere="+(4*3.14*r*r));
            	
            } 
            void volume(float r)
            {
            	System.out.println("volume of sphere="+(4/3)*(3.14*r*r*r));
            }
            void area_rectangle(float w,int l)
            {
            	System.out.println("area of rectangle"+(w*l));
            }
              
             public static void main (String[]args) throws IOException
             {
            	 int c ;
            	 BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
            	 functionareaofsphere obj=new functionareaofsphere();
            	 System.out.println	("\n 1 for area of sphere \n 2 volume of sphere \n 3 area of rectangle") ;
                 c=Integer.parseInt(br.readLine());
                 switch(c)
                 {
                	 case 1:
                	 int r; 	 
                		 System.out.println("enter any number");
                		 r=Integer.parseInt(br.readLine());
                		 obj.area(r);
                		 break;
                	 case 2:
                	 float a;
                		 System.out.println("enter any number");
                		 a=Float.parseFloat(br.readLine());
                		 obj.volume(a);
                		 break;	 
                	 case 3:
                	 float b ;
                	 int a1 ;
                	       System.out.println("enter width");
                	       System.out.println("enter length");
                	       b=Float.parseFloat(br.readLine());
                	       a1=Integer.parseInt(br.readLine());
                	       obj.area_rectangle(b,a1);
                	       break;
                	       
                	  default :
                		  System.out.println("Ivalid selection");
                	       break;
                	       
                	        
                		 
                		 
                 }
             }
            
                     
}
