package BasicJava1;

class students {

    String name;
    int mm;
    int scm;
    double comp;

    

    students(String studentName, int mathsMarks, int scienceMarks, double computerMarks) {
        name = studentName;
        mm = mathsMarks;
        scm = scienceMarks;
        comp = computerMarks;
    }

    void check() {
        if (mm >= 90 && scm >= 90 && comp >= 90) {
            System.out.println("Eligible for Science with Computer");
        } else if ((mm + scm + comp) / 3 >= 90) {
            System.out.println("Eligible for Bio-Science");
        } else if ((mm + scm) / 2 >= 80 && (mm + scm) / 2 < 90) {
            System.out.println("Eligible for Science with Hindi");
        } else {
            System.out.println("Not eligible for admission");
        }
    }

    void display() {
        check();
        System.out.println("Student Name: " + name);
        System.out.println("Maths Marks: " + mm);
        System.out.println("Science Marks: " + scm);
        System.out.println("Computer Marks: " + comp);
    }

    public static void main(String[] args) {
        students st = new students("John Doe", 95, 92, 93.5);
        st.display();
    }
}



