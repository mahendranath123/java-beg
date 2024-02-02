package BasicJava1;
import java.io.*;

public class Tour {
    String Tcode;
    int noofAd, noofKd, km;
    float total;

     void AssignFare() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Tcode");
        Tcode = br.readLine();
        System.out.println("Enter No of Adult ");
        noofAd = Integer.parseInt(br.readLine());
        System.out.println("Enter No of kids");
        noofKd = Integer.parseInt(br.readLine());
        System.out.println("Enter km");
        km = Integer.parseInt(br.readLine());

        if (km >= 1000) {
            total = noofAd * 500 + noofKd * 250;
        } else if (km >= 500 && km < 1000) {
            total = noofAd * 300 + noofKd * 150;
        } else {
            total = noofAd * 200 + noofKd * 100;
        }
    }

    void Display() {
        System.out.println("Tcode: " + Tcode);
        System.out.println("No of Adult: " + noofAd);
        System.out.println("No of kids: " + noofKd);
        System.out.println("Total fare: " + total);
    }

    public static void main(String[] args) throws IOException {
        Tour t = new Tour();
        t.AssignFare();
        t.Display();
    }
}
