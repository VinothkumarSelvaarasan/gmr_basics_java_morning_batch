package Interface_LooselyCoupled;

import java.util.Scanner;

public class StudentInformation implements InformationProvider{

	int regiserNumber;
	String name;
	float fees;
	Scanner s=new Scanner(System.in);
	public void getData()
	{
		System.out.println("Enter the Register Number ");
		regiserNumber=s.nextInt();
		System.out.println("Enter the Name ");
		name=s.next();
		System.out.println("Enter the Fees ");
		fees=s.nextFloat();
	}
	public void printData()
	{
		System.out.println("Register Number "+regiserNumber);
		System.out.println("Name "+name);
		System.out.println("Fees "+fees);
	}

}
