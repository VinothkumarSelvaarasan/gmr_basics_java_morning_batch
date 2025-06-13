package ArrayPgm;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		String amazonWareHouse[][]=new String[2][3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<amazonWareHouse.length;i++)
		{
			for(int j=0;j<amazonWareHouse[i].length;j++)
			{
		System.out.println("Enter the Product you want to place in room no "+(i+1)+(j+1));
		amazonWareHouse[i][j]=s.next();
			}
		}
		for(int i=0;i<amazonWareHouse.length;i++)
		{
			for(int j=0;j<amazonWareHouse[i].length;j++)
			{
		System.out.println("Product in the Room No "+(i+1)+(j+1)+" is "+amazonWareHouse[i][j]);
			}
		}
		
		
	}

}
