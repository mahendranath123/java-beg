package BasicJava;
import java.io.*;
class practice________2 {
	
	 public static void main(String[]args)throws IOException
	 
	 {
		 double subject1,subject2,subject3;
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the subject1 marks");
		 subject1= Double.parseDouble(br.readLine());
		 System.out.println("Enter the subject2 marks ");
		 subject2= Double.parseDouble(br.readLine());
		 System.out.println("Enter the subject3 marks");
		 subject3= Double.parseDouble(br.readLine());
		  
		 double totalmarks=subject1+subject2+subject3;
		 double average= totalmarks/3;
		 
		 System.out.println("total marks="+totalmarks);
		 System.out.println("average marks="+average);
		
	 }
	 

}
