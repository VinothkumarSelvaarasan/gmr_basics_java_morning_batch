package ArrayPgm;

public class SimpleArray {
	public static void main(String[] args) {
		int total=0;
		float percentage;
		int marks[]= {89,98,99,100,89,90};
		for(int i=0;i<marks.length;i++)
		{
			total+=marks[i];
		}
		System.out.println("Total Marks is "+total);
		percentage=(float)total/marks.length;
		System.out.println("Percenatage is "+percentage);
	}

}
