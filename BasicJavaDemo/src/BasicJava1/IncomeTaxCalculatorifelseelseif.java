 package BasicJava1;
import java.io.*;

public class IncomeTaxCalculatorifelseelseif
{
    public static void main(String[] args) throws IOException 
    {
        int income, age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your income: ");
        income = Integer.parseInt(br.readLine());

        System.out.print("Enter your age: ");
        age = Integer.parseInt(br.readLine());

        if (age >= 60) 
        {
            System.out.println("Invalid category (age must be less than 60 for this calculation).");
        } else 
            {
            double tax = 0.0;

            if (income <= 25000) 
              {
                tax = 0;
            } else if (income <= 50000) {
                tax = (income - 25000) * 0.1;
            } else if (income <= 100000) {
                tax = (25000 * 0.1) + (income - 50000) * 0.3;
            } else {
                System.out.println("Income exceeds the taxable limit.");
                 
            }

            System.out.println("Income tax to be paid: " + tax);
            
            
        }
    }
}
