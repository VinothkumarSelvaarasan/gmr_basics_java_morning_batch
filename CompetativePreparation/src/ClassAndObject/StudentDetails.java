package ClassAndObject;

import java.util.Scanner;

public class StudentDetails {
	int registerNo;
	String name;
	String department;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter your register Number ");
		registerNo=s.nextInt();
		System.out.println("Enter the Name ");
		name=s.next();
		System.out.println("Enter the Department ");
		department=s.next();
	}
	void printData()
	{
		System.out.println("Register Number is " +registerNo );
		System.out.println("Name "+name);
		System.out.println("Department "+department);
	}
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails();
		sd.getData();
		sd.printData();
		
	}

}
