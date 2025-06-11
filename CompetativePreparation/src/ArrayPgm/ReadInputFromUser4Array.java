package ArrayPgm;

import java.util.Scanner;

public class ReadInputFromUser4Array {
	public static void main(String[] args) {
		int marks[]=new int[6];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the Marks for "+(i+1));
			marks[i]=s.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks of "+(i+1)+ " is "+marks[i]);
		}
		
		}
	}


