package BasicJava1;


import java.io.*;

public class automorphicnumberdowhileloop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n, sq,count =1;
        n = Integer.parseInt(br.readLine());
        sq = n * n;
        int t=n;
        

        while (t> 0) {
            count = count*10;
            t =t/10;
        }

        if (sq % count == n) {
            System.out.println("It is automorphic");
            
        } else {
            System.out.println("It is not automorphic");
            
        }
    }
}
