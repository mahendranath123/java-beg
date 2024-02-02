package BasicJava;
import java.util.Scanner;
public class scannnerclass {


            public static void main(String[]args)
            {
            
                   Scanner s=new Scanner (System.in);
                    System.out.println("Enter you name :");
                     String name =s.next();
                     System.out.println ("Enter you gender :");
                      char gender = s.next().charAt(0);
                      System.out.println("Enter you age");
                       int age =s.nextInt();
                       System.out.println ("Enter you phone number :");
                       long phone=s.nextLong();
                    	System.out.println("---------------------------");
                        System.out.println("Name : "+name);
                        System.out.println("Gender :"+gender);
                        System.out.println("Age : "+age);
                        System.out.println("Phone : "+phone);
                        
            }  
}                  
                    		 
                   
