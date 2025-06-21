package ExceptionHandling;
import java.util.Scanner;
public class FinallyBlock {
	int marks[]=new int[6];
	Scanner s=new Scanner(System.in);
	void readData() {
		try {
			for(int i=0;i<marks.length;i++) {
				marks[i]=s.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException aieob)  {
			System.out.println(aieob);
		}
		finally
		{ //Finally block get executed at any cost if error occur or not occur
			System.out.println("I am a finally block");
		}
		System.out.println("Read Data is finished");
	}
	void printData() {
		try {
		for(int i=0;i<=marks.length;i++) {
			System.out.println(marks[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException aieob) {
		System.out.println(aieob);
	}
		finally
		{ //Finally block get executed at any cost if error occur or not occur
			System.out.println("I am a finally block");
		}
		System.out.println("Print Data is finished");
	}
	public static void main(String[] args) {
		FinallyBlock fin=new FinallyBlock();
		fin.readData();
		fin.printData();
	}

}
