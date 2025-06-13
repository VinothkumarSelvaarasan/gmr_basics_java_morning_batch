package ArrayPgm;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int marks[]= {91,92,90,80,93,92};
		int temp;
		for(int i=0;i<marks.length;i++)
		{
			for(int j=i+1;j<marks.length;j++)
			{
				if(marks[i]>= marks[j])
				{
					temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
				}
			}
		}
		for(int i=0;i<marks.length;i++)
		{
			System.out.println( marks[i]);
		}
		
			System.out.print("Second Largest Number "+ marks[marks.length-2]);//Print Values in Ascending order
		

}
}