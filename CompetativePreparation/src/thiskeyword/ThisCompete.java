package thiskeyword;

public class ThisCompete {
	int registerNumber;
	String name;
	ThisCompete()
	{
		registerNumber=666;
		name="vinoth";
	}
	ThisCompete(int registerNumber,String name)
	{
		this();
		this.printData();
		this.registerNumber=registerNumber;
		this.name=name;
		this.printData();
	}
	void printData()
	{
		System.out.println("Register Number is "+registerNumber);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		ThisCompete thc=new ThisCompete(777,"Ashokkumar Selvaarasan");
	}

}
