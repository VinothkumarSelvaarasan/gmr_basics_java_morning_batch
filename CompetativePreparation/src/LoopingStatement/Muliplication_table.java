package LoopingStatement;

import java.util.Scanner;

public class Muliplication_table {
	public static void main(String[] args) {
		int range,muliplication;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		range=s.nextInt();
		System.out.println("Enter the Mulitplication Table you want");
		muliplication=s.nextInt();
		for(int i=1;i<=range;i++)
		{
			System.out.println(i +" * "+muliplication+" = "+(i*muliplication));
		}
		
	}

}
