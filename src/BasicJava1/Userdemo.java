package BasicJava1;

import java.io.*;

class Userdemo {
    String name;
    int age, contact;

    void Input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        name = br.readLine();
        System.out.println("Enter your age:");
        age = Integer.parseInt(br.readLine());
        System.out.println("Enter your contact number:");
        contact = Integer.parseInt(br.readLine());
    }

    void Show() {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your contact: " + contact);
    }

    public static void main(String[] args) throws IOException {
        Userdemo obj = new Userdemo();
        obj.Input();
        obj.Show();
    }
}
