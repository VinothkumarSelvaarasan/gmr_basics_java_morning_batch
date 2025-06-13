package Constructor;

public class SimpleConstructior {
	int registerNumber;
	String name;
	SimpleConstructior()
	{
		registerNumber=666;
		name="Vinothkumar Selvaarasan";
	}
	void printdata()
	{
		System.out.println("Register Number is "+registerNumber);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		SimpleConstructior sCons=new SimpleConstructior();
		sCons.printdata();
	}

}
