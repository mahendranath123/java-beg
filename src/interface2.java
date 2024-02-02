import java.security.PublicKey;

import BasicJava.newpalindrome;

class inteface2  implements interface1
{
	public static void main(String[]args)
	{
		 
		 public void eve(int a)
		{
			if (a%2==0)
			{
				System.out.println("it is even number");
			}
			else {
				System.out.println("it is odd number");
				
			}
		}
		
		public void buzz(int number)
		{
			if (number % 7 == 0 || number % 10 == 0)
			{
				System.out.println("it is buzz number");
			}
			else 
				{
				System.out.println("it is not buzz number");	
				}
			}
		public static void main(String[]args)
		{
			inteface2  to= newinteface2 ();
			to.ev(10);
			to.buzz(10);
		}
		
	}
}