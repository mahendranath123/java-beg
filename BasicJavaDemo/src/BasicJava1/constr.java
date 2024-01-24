package BasicJava1;

import BasicJava.newpalindrome;

class constr {
	
	
	int bno;
    String name;
    int call;
    double amt;
	 
	 constr() {
		 
		 bno = 0;
	        name = "";
	        call = 0;
	        amt = 0.0;
	 }
     constr(int r)
	 {
		 System.out.println(" circle "+3.14*r*r);
	 }
	 
	 public static void main (String[]args)
	 {
		 constr br=new constr( );
		 constr br1=new constr(3);
		 
	 }

}
