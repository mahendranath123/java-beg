package BasicJava1;
import java.io.*;

public class FunctionDefaultAddition {
    void Addition() throws IOException {
        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        System.out.println("Addition = " + (a + b));
    }

    public static void main(String[] args) throws IOException {
      
    	   FunctionDefaultAddition obj = new FunctionDefaultAddition();
       
        obj.Addition();
        
       
        
       
    }
       
    
}
