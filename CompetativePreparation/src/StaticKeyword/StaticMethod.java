package StaticKeyword;

public class StaticMethod {
	int count=0;
	static int staticvar=0;
	
	static void increment()
	{
		staticvar++;
	}
	void incrementNonStatic()
	{
		count++;
	}
	void printdata()
	{
		System.out.println("Static variable Value is "+staticvar);
		System.out.println("Non Static Variable value is "+count);
	}
	public static void main(String[] args) {
		StaticMethod sm=new StaticMethod();
		StaticMethod.increment();
		sm.incrementNonStatic();
		StaticMethod.increment();
		sm.incrementNonStatic();
		sm.printdata();
		StaticMethod sm1=new StaticMethod();
		StaticMethod.increment();
		sm1.incrementNonStatic();
		StaticMethod.increment();
		sm1.incrementNonStatic();
		sm1.printdata();
	}
}
