package DataEncapsulation;

import java.util.Scanner;

public class PrintInfo {
	Scanner s=new Scanner(System.in);
	Registeration regi=new Registeration();
	void getData()
	{
		System.out.println("Enter the Register Number ");
		regi.setRegisterNumber(s.nextInt());
		System.out.println("Enter the UserName");
		regi.setUserName(s.next());
	}
	void printData()
	{
		System.out.println("Register Number is "+regi.getRegisterNumber());
		System.out.println("User Name is "+regi.getUserName());
	}
	public static void main(String[] args) {
		PrintInfo pi=new PrintInfo();
		pi.getData();
		pi.printData();
	}

}
