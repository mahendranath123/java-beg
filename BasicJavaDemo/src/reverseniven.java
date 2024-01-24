


import java.io.*;

class reverseniven {
	
	public static void main(String[]args)throws IOException
    {
       BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int n,result=0,remainder,m;
          System.out.println("enter the number is reverse");
          n=Integer.parseInt(br.readLine());
           
            while(n>0)
              {
                remainder=n%10;
                result=result*10+remainder;
                 n=n/10;    
                }
                 System.out.println("Reverse of given no="+result);
                 
                 
	                  System.out.println("enter the check number is niven number");
	                 n=Integer.parseInt(br.readLine());
	                    m=n;
	                    while(n>0)
	                      {
	                        remainder=n%10;
	                        result=result+remainder;
	                         n=n/10;  
	                        }
	                          if (m%result==0)
	                          {
	                             System.out.println("it is niven number ="+m);
	                           }
	                          else
	                           {
	                              System.out.println("it is not niven number ="+m);
	                            }      
	                       
                       
                  
            }
    }




    