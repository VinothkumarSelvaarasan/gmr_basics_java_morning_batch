package FinalKeyword;

public class FinalVariable {
	public final int REGISTERNUMBER=783;
	public final String NAME; 
	//In case value not assigned at the time of declaration
	//you can assign in the constructor
	FinalVariable()
	{
		NAME="Vinothkumar ";
	}
	
	//final varaiable value not allow us to change the value once it assign
	void printData()
	{
		System.out.println("Register Number is "+REGISTERNUMBER);
		System.out.println("Name is "+NAME);
	}
	
	public static void main(String[] args) {
		FinalVariable fv=new FinalVariable();
		fv.printData();
	}

}
