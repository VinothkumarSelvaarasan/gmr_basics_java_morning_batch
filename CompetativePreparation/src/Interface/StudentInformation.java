package Interface;

public class StudentInformation implements Information {
	public void getData()
	{
		System.out.println("I am get Data Methods");
	}
	public void printData()
	{
		System.out.println("I am a Print Data Method");
	}
	public static void main(String[] args) {
		StudentInformation si=new StudentInformation();
		si.getData();
		si.printData();
	}

}
