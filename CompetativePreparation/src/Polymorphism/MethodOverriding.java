package Polymorphism;


class parentClass{
	void printData(String name)
	{
		System.out.println("Your Name is "+name);
	}
}

public class MethodOverriding extends parentClass {
	
	@Override
	void printData(String Address)
	{
		System.out.println("Your Address  is "+Address);
	}
public static void main(String[] args) {
	parentClass pc=new parentClass();
	MethodOverriding mo=new MethodOverriding();
	pc.printData("Vinothkumar Selvaarasan");
	mo.printData("India");
}
}
