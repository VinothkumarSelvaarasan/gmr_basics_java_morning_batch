package ConditionalStatement;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("You Enter 1");
			break;
		case 2:
			System.out.println("You Entered 2");
			break;
		case 3:
			System.out.println("You Entered 3");
			break;
		default: 
			System.out.println("You entered Value is above 3");
			break;
		}
	}
	
	

}
