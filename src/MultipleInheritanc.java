
import java.io.*;

interface A
   {  
       public void Area (int r);
      }
interface B
   {
      public void show (int r);
     }
class child implements A,B
    {
         public void Area(int r)
        {
         System.out.println("Area of circle ="+(3.14*r*r));
          }
     public void show (int r)
        {
           System.out.println("Perimeter of circle="+(3.14*2*r));
             }
     void output()
       {
            System.out.println("Child class method");
          }
      }

class MultipleInheritance
 {
  public static void main (String[]args) throws IOException
   {
      child obj =new  child();
       obj.Area(10);
       obj.show(10);
       obj.output();
     }
   }