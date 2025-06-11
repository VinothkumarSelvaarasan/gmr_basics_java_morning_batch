package ConditionalStatement;

import java.util.Scanner;

public class BasicIf {
	public static void main(String[] args) {
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age ");
		age=s.nextInt();
		if(age<18)
			System.out.println("Not Eligible for voting");
		else
			System.out.println("You are eligible for vote");
	}

}
