package BasicJava1;
import java.io.*;


public class library {
	
	 int acc ;
     String title,author;
	double day;
	 void input() throws IOException
	 {
		 BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		 
		 System.out.println("enter accession number");
		 acc=Integer.parseInt(br.readLine());
		  
		 System.out.println("enter a title");
		 title=br.readLine();
		 
		 System.out.println("enter a author");
		 author=br.readLine();
		 
	 }
	 
	 void compute() throws IOException
	 {
		 
		 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		 
		 System.out.println("Enter the number of days ");
		 day=Double.parseDouble(br.readLine());
		 
	 }
	 void display()
	 
	 {
		 
		 System.out.println("____________________________________________________");
		 
		 System.out.println("fucking liabrary");
		 
		 System.out.println(" accession number"+acc);
		
		  
		 System.out.println(" title="+title);
		 
		 System.out.println(" a author="+author);
		 
		 System.out.println(" a author="+day*2);
		
	 }
	 
	 public static void main (String[]args)throws IOException
	 {
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("  fucking Library");
		
		library obj =new library ();
		obj.input();
		obj.compute();
		obj.display();
	 }

}
