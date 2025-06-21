package InheritanceConcept;

import java.util.Scanner;

class PersonalRecords
{
	String name;
	Scanner s=new Scanner(System.in);
	PersonalRecords()
	{
		this.name="Bhushan";
	}
	PersonalRecords(String name)
	{
		this.name=name;
	}
	void getData()
	{
		System.out.println("Enter the Name ");
		name=s.next();
	}
	void printData()
	{
		System.out.println("Name "+name);
	}
}



public class StudentDetails extends PersonalRecords{
	float tenthPercentage;
	StudentDetails()
	{
		this.tenthPercentage=88;
	}
	StudentDetails(float tenthPercentage)
	{
		this.tenthPercentage=tenthPercentage;
	}
	void getStudentDetails()
	{
		System.out.println("Enter the tenth Marks ");
		tenthPercentage=s.nextFloat();
	}
	void printStudentDetails()
	{
		System.out.println("Tenth Marks "+tenthPercentage);
	}
	
public static void main(String[] args) {
	StudentDetails sd=new StudentDetails();
	sd.printData();
	sd.printStudentDetails();
	sd.getData();
	sd.getStudentDetails();
	sd.printData();
	sd.printStudentDetails();
}
}
