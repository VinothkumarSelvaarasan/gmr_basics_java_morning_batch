package ExceptionHandling;

import java.util.Scanner;

public class BasicOfException {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	 void readandeval()
	{
		System.out.println("Enter the Value for A");
		a=s.nextInt();
		System.out.println("Enter the Value for B");
		b=s.nextInt();
		try
		{
			c=a/b;
			System.out.println("The output for a/b is "+c);	
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		System.out.println("Thank you");
	}
	public static void main(String[] args) {
		BasicOfException be=new BasicOfException();
		be.readandeval();
	}
	

}
