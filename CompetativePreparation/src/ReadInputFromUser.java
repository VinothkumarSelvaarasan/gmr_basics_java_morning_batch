import java.util.Scanner;

public class ReadInputFromUser {

	public static void main(String[] args) {
		int registerNo;
		String name;
		String emailid;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Register Number");
		registerNo=s.nextInt();
		System.out.println("Enter the Name ");
		name=s.next();
		System.out.println("Enter the Emailid ");
		emailid=s.next();
		System.out.println("Register No "+registerNo);
		System.out.println("Name is "+name);
		System.out.println("Email id is "+emailid);
	
		
	}
}
