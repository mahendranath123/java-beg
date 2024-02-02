package BasicJava;


import java.io.*;
class Areacircle
{
public static void main (String []args) throws IOException
{
  double r;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter radius");
   r= Double.parseDouble(br.readLine());
    

    System.out.println("Area of circle="+(314*r*r));
  }
  }