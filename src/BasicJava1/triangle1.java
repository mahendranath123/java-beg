package BasicJava1;


import java.io.InputStreamReader;



class triangle1  implements  area,circle 
{
	
      public void display(double base ,double height )
      {
    	  
          double area = 0.5 * base * height;
          System.out.println("Area of the triangle: " + area);
      }
      public void  tr(int r) 
      {
    	  
		System.out.println("area of circle"+(3.14*r*r));
	}

 
 public static void main(String[]args)
 {
	 triangle1 t=new triangle1();
		t.display(5,8);
	     t.tr(100);
 }

	
}
