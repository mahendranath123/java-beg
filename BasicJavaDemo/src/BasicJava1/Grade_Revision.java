package BasicJava1;


import java.io.*;

class Grade_Revision {

    String name;
    int bas;
    int expn;
    double inc;
    double nbas;

    Grade_Revision() {
        name = "";
        bas = 0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
    }

    void accept() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter employee name: ");
        name = reader.readLine();
        System.out.print("Enter basic salary: ");
        bas = Integer.parseInt(reader.readLine());
        System.out.print("Enter years of experience: ");
        expn = Integer.parseInt(reader.readLine());
    }

    void increment() {
        if (expn <= 3) {
            inc = 1000 + 0.1 * bas;
        } else if (expn <= 5) {
            inc = 3000 + 0.12 * bas;
        } else if (expn <= 10) {
            inc = 5000 + 0.15 * bas;
        } else {
            inc = 8000 + 0.20 * bas;
        }

        nbas = bas + inc;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: ₹" + bas);
        System.out.println("Years of Experience: " + expn + " years");
        System.out.println("Increment: ₹" + inc);
        System.out.println("New Basic Salary: ₹" + nbas);
    }

    public static void main(String[] args) throws IOException {
        Grade_Revision employee = new Grade_Revision();
        employee.accept();
        employee.increment();
        employee.display();
    }
}
