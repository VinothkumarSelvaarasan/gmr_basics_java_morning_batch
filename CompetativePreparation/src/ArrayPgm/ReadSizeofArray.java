package ArrayPgm;

import java.util.Scanner;

public class ReadSizeofArray {
	public static void main(String[] args) {
		int marks[];  //Declare an Array
		int size;
		int total=0;
		float percentage;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of the array ");
		size=s.nextInt();
		marks=new int[size]; //Define an Array
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the Marks "+(i+1));
			marks[i]=s.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			total+=marks[i];
			System.out.println("Marks of "+(i+1)+" is "+marks[i]);
		}
		System.out.println("Total Marks "+total);
		percentage=(float)total/marks.length;
		System.out.println("Total Percentage "+percentage);
		}
		
	}


