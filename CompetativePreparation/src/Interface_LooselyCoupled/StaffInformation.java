package Interface_LooselyCoupled;

import java.util.Scanner;

public class StaffInformation implements InformationProvider{
	int staffId;
	String staffName;
	float salary;
	Scanner s=new Scanner(System.in);
		public void getData()
		{
			System.out.println("Enter the Staff Id");
			staffId=s.nextInt();
			System.out.println("Enter the Staff Name ");
			staffName=s.next();
			System.out.println("Enter the Salary ");
			salary=s.nextFloat();
		}
		public void printData()
		{
			System.out.println("Staff Id "+staffId);
			System.out.println("Staff Name "+staffName);
			System.out.println("Annual Salary "+(salary*12));
		}
		

}
