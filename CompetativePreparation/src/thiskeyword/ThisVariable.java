package thiskeyword;

public class ThisVariable {
	int registerNumber;
	String name;
	ThisVariable(int registerNumber,String name)
	{
		this.registerNumber=registerNumber;
		this.name=name;
	}
	void printData()
	{
		System.out.println("Register Number is "+registerNumber );
		System.out.println("Name is "+name );
	}
public static void main(String[] args) {
	ThisVariable tv=new ThisVariable(666, "VinothKumar Selvaarasan");
	tv.printData();
}
}
