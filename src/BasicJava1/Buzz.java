package BasicJava1;
import java.io.*;

class Buzz {
    
    
    Buzz(int n) {
        if (n % 7 == 0 || n % 10 == 7) {
            System.out.println("It is a buzz number");
        } else {
            System.out.println("It is not a buzz number");
        }
    }

   
    Buzz(int n, int sq) {
        sq = n * n;
        if ((sq % 10 == n)||(sq % 100 == n)||(sq % 1000 == n)){
            System.out.println("It is an automorphic number");
        } else {
            System.out.println("It is not an automorphic number");
        }
    }

    public static void main(String[] args) throws IOException {
    	String ch;
    	
    	do {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.print("Enter a number to check for buzz: ");
        int buzzNumber = Integer.parseInt(br.readLine());
        Buzz buzzObj = new Buzz(buzzNumber);

        
        System.out.print("Enter a number to check for automorphic: ");
        int automorphicNumber = Integer.parseInt(br.readLine());
        int square = 0;
        Buzz automorphicObj = new Buzz(automorphicNumber, square);
        System.out.println("do you want you continue Y/N");
        ch=br.readLine();
    	} while(ch.equals("Y")||ch .equals ("y"));
     
    }
}
