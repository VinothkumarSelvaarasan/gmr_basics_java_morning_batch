package Polymorphism;

public class MethodOverloading {
	
	void getInfo()
	{
		System.out.println("Welcome to Method Overloading");
	}
	String getInfo(String name)
	{
		return "Hi Welcome to Method Overloading "+name;
	}
	String getInfo(String name,String Address)
	{
		return "Hi Welcome to Method Overloading "+name + " from "+Address;
	}
	String getInfo(int pincode)
	{
		return "your pincode is "+pincode;
	}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.getInfo();
		System.out.println(mo.getInfo("Vinothkumar Selvaarasan"));
		System.out.println(mo.getInfo(600001));
		System.out.println(mo.getInfo("Vinothkumar Selvaarasan","India"));
		
		
		
	}

}
