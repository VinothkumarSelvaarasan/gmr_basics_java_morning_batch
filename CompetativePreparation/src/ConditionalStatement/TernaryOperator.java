package ConditionalStatement;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age ");
		age=s.nextInt();
		String eligible= age >=18? "Eligible": "Not Eligible";
		System.out.println(eligible);
		
		
	}

}
