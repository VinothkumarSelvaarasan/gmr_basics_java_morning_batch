package StaticKeyword;

public class StaticBlock {
	static {
		System.out.println("I am Static Block 1");
	}
	
	StaticBlock()
	{
		System.out.println("I am a Constructor");
	}
	static {
		System.out.println("I am Static Block 2");
	}
	static {
		System.out.println("I am Static Block 3");
	}
	void printInfo()
	{
		System.out.println("I am a method");
	}
	public static void main(String[] args) {
		StaticBlock sb=new StaticBlock();
		sb.printInfo();
		
	}
	
}
