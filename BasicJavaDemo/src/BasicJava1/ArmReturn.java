package BasicJava1;
import java.io.*;

class ArmReturn {
    int isArmstrong(int n) {
        int m = n; 
        int x = 0; 
        int r = 0;
        while (n != 0) {
            r = n % 10;
            x = x + r * r * r; 
            n = n / 10;
        }
        if (x == m) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String arg[]) throws IOException { 
        int n, t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArmReturn obj = new ArmReturn();
        System.out.println("Enter a number:- "); 
        n = Integer.parseInt(br.readLine());

        t = obj.isArmstrong(n);
        if (t == 1) {
            System.out.println("Return value=" + t); 
            System.out.println("It is an Armstrong Number.");
        } else {
            System.out.println("Return value=" + t); 
            System.out.println("It is not an Armstrong Number.");
        }
    }
}
