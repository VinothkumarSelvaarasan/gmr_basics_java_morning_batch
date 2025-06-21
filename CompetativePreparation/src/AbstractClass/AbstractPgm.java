package AbstractClass;


abstract class abstractclass //Object creation is not possible in the Abstract Class
{
	abstractclass()
	{
		System.out.println("I am a Abstract Class Constructor");
	}
	abstract void printInfo();
	void getInfo()
	{
		System.out.println("I am a non abstract Methods");
	}	
}
public class AbstractPgm extends abstractclass{
	
	AbstractPgm()
	{
		System.out.println("I am a Subclass Constructor");
	}
	@Override
	void printInfo()
	{
		System.out.println("I am a abstract method but define in subclass");
	}

	public static void main(String[] args) {
		abstractclass ac=new AbstractPgm();
		ac.printInfo();
		ac.getInfo();
	}
	
	
	
	
}
