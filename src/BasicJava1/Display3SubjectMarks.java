package BasicJava1;
import java.io.*;

public class Display3SubjectMarks {
    
    public static void main(String[] args) throws IOException {
        int a, b, c, totalMarks, averageMarks;
        double percentageA, percentageB, percentageC;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first subject marks:");
        a = Integer.parseInt(br.readLine());

        System.out.println("Enter the second subject marks:");
        b = Integer.parseInt(br.readLine());

        System.out.println("Enter the third subject marks:");
        c = Integer.parseInt(br.readLine());

        totalMarks = a + b + c;
        averageMarks = totalMarks / 3;
        double maxMarksPerSubject = 100.0; // Assuming maximum marks for each subject is 100

        percentageA = (a / maxMarksPerSubject) * 100;
        percentageB = (b / maxMarksPerSubject) * 100;
        percentageC = (c / maxMarksPerSubject) * 100;

        System.out.println("Percentage of subject A: " + percentageA + "%");
        System.out.println("Percentage of subject B: " + percentageB + "%");
        System.out.println("Percentage of subject C: " + percentageC + "%");
        
        System.out.println("Total marks of subjects: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);
    }
}
