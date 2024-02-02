package BasicJava1;
import java.io.*;

class Student {

    int java_marks, python_marks, linux_marks, roll_no;
    String Name, Grade;
    int avg;

    void GetData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Roll No");
        roll_no = Integer.parseInt(br.readLine());
        System.out.println("Enter a student Name");
        Name = br.readLine();
        System.out.println("Enter java Subject marks");
        java_marks = Integer.parseInt(br.readLine());
        System.out.println("Enter python Subject marks");
        python_marks = Integer.parseInt(br.readLine());
        System.out.println("Enter Linux Subject marks");
        linux_marks = Integer.parseInt(br.readLine());
    }

    void AssignGrade() {
        // Calculate the average by dividing the sum by the total number of subjects (3)
        avg = (java_marks + python_marks + linux_marks) / 3;

        if ((avg >= 40) && (avg < 60))
            Grade = "Second class";
        else if ((avg >= 60) && (avg < 75))
            Grade = "Distinction class";
        else if ((avg >= 75) && (avg < 90))
            Grade = "Merit class";
        else
            Grade = "Fail";
    }

    void Output() {
        System.out.println("Roll No=" + roll_no);
        System.out.println("Student Name=" + Name);
        System.out.println("Java Subject marks=" + java_marks);
        System.out.println("Python Subject marks=" + python_marks);
        System.out.println("Linux Subject marks=" + linux_marks);
        System.out.println("Average=" + avg);
        System.out.println("Grade=" + Grade);
    }

    public static void main(String[] args) throws IOException {
        Student obj = new Student();
        obj.GetData();
        obj.AssignGrade();
        obj.Output();
    }
}
