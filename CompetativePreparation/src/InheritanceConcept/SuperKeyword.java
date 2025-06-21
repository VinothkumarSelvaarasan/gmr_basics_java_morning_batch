package InheritanceConcept;

import java.util.Scanner;

class PersonalRecords1
{
	String name;
	Scanner s=new Scanner(System.in);
	PersonalRecords1()
	{
		this.name="Bhushan";
	}
	PersonalRecords1(String name)
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



public class SuperKeyword extends PersonalRecords1{
	float tenthPercentage;
	SuperKeyword()
	{
		super();
		this.tenthPercentage=88;
	}
	SuperKeyword(float tenthPercentage)
	{
		this.tenthPercentage=tenthPercentage;
	}
	void getStudentDetails()
	{
		super.getData();
		System.out.println("Enter the tenth Marks ");
		tenthPercentage=s.nextFloat();
	}
	void printStudentDetails()
	{
		super.printData();
		System.out.println("Tenth Marks "+tenthPercentage);
	}
	
public static void main(String[] args) {
	SuperKeyword sd=new SuperKeyword();
	sd.printStudentDetails();
	sd.getStudentDetails();
	sd.printStudentDetails();
}
}
