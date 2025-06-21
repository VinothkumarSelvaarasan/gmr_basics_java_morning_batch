package Constructor;

public class ConstructorwithArguments {
	int registerNumber;
	String name;
	String dept;
	boolean isContinue;
	ConstructorwithArguments()
	{
		registerNumber=666;
		name="Vinothkumar Selvaarasan";
		dept="CSE";
		isContinue=true;
	}
	ConstructorwithArguments(int r,String n,String d,boolean ic)
	{
		registerNumber=r;
		name=n;
		dept=d;
		isContinue=ic;
	}
	void printdata()
	{
		System.out.println("register Number is "+registerNumber);
		System.out.println("Name is "+name);
		System.out.println("Department "+dept);
		System.out.println("Is Active "+isContinue);
	}
	public static void main(String[] args) {
		ConstructorwithArguments cwa=new  ConstructorwithArguments();
		ConstructorwithArguments cwa1=new ConstructorwithArguments(777,"Ashokkumar Selvaarasan","Mech",true);
		
		cwa.printdata();
		cwa1.printdata();
	}
	
	

}
