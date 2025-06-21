package StaticKeyword;

public class StaticVar {
int count=0;
static int staticCount=0;

void increment()
{
	count++;
	staticCount++;
}
void printData()
{
	System.out.println("The count Value is "+count);
	System.out.println("the Static variable value is "+staticCount);
}
public static void main(String[] args) {
	StaticVar sv=new StaticVar();
	sv.increment();
	sv.increment();
	sv.printData();
	StaticVar sv123=new StaticVar();
	sv123.increment();
	sv123.increment();
	sv123.printData();
}
}
