package ArrayPgm;

public class EvenNumbersinArray {
	public static void main(String[] args) {
		int marks[]= {89,90,91,92,93,94,95,96};
		
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]%2==0)
			{
				System.out.print(marks[i]+ " , ");
			}
		}
	}

}
