package BasicJava1;

import java.io.*;


interface Triangle {
    void area(int a, int b) throws IOException;
}


class CalculateArea implements Triangle {
    
   
    public void area(int a, int b) throws  IOException 
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     
            System.out.print("Enter base length: ");
            a = Integer.parseInt(br.readLine());

            System.out.print("Enter height: ");
            b = Integer.parseInt(br.readLine());
         
        

        System.out.println("Area of triangle = " + (a * b * 0.5));
    }
}
