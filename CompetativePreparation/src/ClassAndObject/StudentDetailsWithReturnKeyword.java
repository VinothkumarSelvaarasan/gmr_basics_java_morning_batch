package ClassAndObject;

import java.util.Scanner;

public class StudentDetailsWithReturnKeyword {
	int registerNo;
	String name;
	int marks[]=new int[3];
	int total;
	float percentage;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter the Register Number");
		registerNo=s.nextInt();
		System.out.println("Enter the Name");
		name=s.next();
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the Marks for the Subject "+(i+1));
			marks[i]=s.nextInt();
		}
	}
	
	float percentageCalculator()
	{
		for(int i=0;i<marks.length;i++)
		{
			total+=marks[i];
		}
		percentage=(float)total/marks.length;
		return percentage;
	}
	
	void printdata()
	{
		System.out.println("Register Number is "+registerNo);
		System.out.println("Name is "+name);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks for the Subject "+(i+1)+marks[i]);
		}
		
		System.out.println("Percentage "+percentageCalculator());
		System.out.println("Total "+total);
		
	}
	public static void main(String[] args) {
		StudentDetailsWithReturnKeyword sdwrk=new StudentDetailsWithReturnKeyword();
		sdwrk.getData();
		sdwrk.printdata();
	}

}
