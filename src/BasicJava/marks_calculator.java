package BasicJava;
import java.io.*;
public class marks_calculator {
	
	public static void main(String[]args) throws  IOException
	{
		double subject1,subject2,subject3;
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		         {
		            System.out.println("Enter marks for subject 1: ");
		             subject1 =Double.parseDouble(br.readLine());

		            System.out.println("Enter marks for subject 2: ");
		             subject2 = Double.parseDouble(br.readLine());

		            System.out.println("Enter marks for subject 3: ");
		             subject3 = Double.parseDouble(br.readLine());

		            double totalMarks = subject1 + subject2 + subject3;
		            double average = totalMarks / 3;

		            System.out.println("Total marks: " + totalMarks);
		            System.out.println("Average marks: " + average);
		        
		        }
		    }
		

	}


