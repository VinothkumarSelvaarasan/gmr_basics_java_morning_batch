package ConditionalStatement;

import java.util.Scanner;

public class IfElseIfElse {
	public static void main(String[] args) {
		int percentage;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Percentage ");
		percentage=s.nextInt();
		if(90<=percentage && 100>=percentage)
		{
			System.out.println("S");
		}
		else if (80<= percentage && 89>=percentage) {
			System.out.println("A");
		}
		else if (70<= percentage && 79>=percentage) {
			System.out.println("B");
		}
		else if (60<= percentage && 69>=percentage) {
			System.out.println("C");
		}
		else if (50<= percentage && 59>=percentage) {
			System.out.println("D");
		}
		else if (40<= percentage && 49>=percentage) {
			System.out.println("E");
		}
		else
		{
			System.out.println("F");
		}
		
	}

}
