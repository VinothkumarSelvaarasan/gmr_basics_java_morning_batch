package ArrayListWithPojoClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListPojo {
	Scanner s=new Scanner(System.in);
	
	ArrayList<StudentInfo> arrayStudentInfo=new ArrayList<StudentInfo>();
	void readData()
	{
		for (int i=0;i<2;i++)
		{
			StudentInfo si=new StudentInfo();
			System.out.println("Enter the Register Number");
			si.setRegisterationNumber(s.nextInt());
			System.out.println("Enter the Name ");
			si.setName(s.next());
			System.out.println("Enter the department");
			si.setDepartment(s.next());
			arrayStudentInfo.add(si);
			
		}
		
		
	}
	void printData()
	{
		Iterator<StudentInfo> si=arrayStudentInfo.iterator();
		while(si.hasNext())
		{
			System.out.println(si.next());
		}
		
	}
	public static void main(String[] args) {
		ArrayListPojo alp=new ArrayListPojo();
		alp.readData();
		alp.printData();
	}
	
	

}
