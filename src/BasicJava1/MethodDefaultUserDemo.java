package BasicJava1;
import java.io.*;

public class MethodDefaultUserDemo {
       String name;
        int age, contact;

       void input() throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter your name: ");
           name = br.readLine();
           System.out.println("Enter your age: ");
           age = Integer.parseInt(br.readLine());
           System.out.println("Enter your contact number: ");
           contact = Integer.parseInt(br.readLine());
    }

      void show() {
         System.out.println("Your name: " + name);
         System.out.println("Your age: " + age);
         System.out.println("Your contact number: " + contact);
    }

      public static void main(String[] args) throws IOException {
           MethodDefaultUserDemo obj = new MethodDefaultUserDemo();
          obj.input();
          obj.show();
    }
}
