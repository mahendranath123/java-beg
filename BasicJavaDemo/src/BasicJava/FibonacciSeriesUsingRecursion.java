package BasicJava;

public class FibonacciSeriesUsingRecursion {
	static int n1=0,n2=1,n3=0;    
	 static void printlnFibonacci(int count){   //(10) 
	    if(count>0){                          //(10 >0 10 is bigger than is ok 
	         n3 = n1 + n2;    //0=0+1 ans is 1
	         n1 = n2;          // 0=1
	         n2 = n3;           // 1=1
	         System.out.println(" "+n3);  // 1  
	         printlnFibonacci(count-1);    //10-1 ans 9
	     }    
	 }    
	 public static void main(String args[]){    
	  int count=10;    
	  System.out.println(n1+" "+n2);    // 1+0
	  printlnFibonacci(count-2);  // 9-2
	 }  
	}              

