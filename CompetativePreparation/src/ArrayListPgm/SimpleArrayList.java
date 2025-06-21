package ArrayListPgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class SimpleArrayList {
	ArrayList<String> studentName=new ArrayList<String>();
	void addData()
	{
		studentName.add("Vinothkumar Selvaarasan");
		studentName.add("Bhusan");
		studentName.add("Bhanu");
		studentName.add("Mani");
		studentName.add("Vinothkumar Selvaarasan");
		
	}
	void printData()
	{
		Collections.sort(studentName);//Sorting the given data 
		Iterator<String> itera=studentName.iterator();
		while(itera.hasNext())
		{
			System.out.println(itera.next());
		}
	}
	public static void main(String[] args) {
		SimpleArrayList sal=new SimpleArrayList();
		sal.addData();
		sal.printData();
	}

}
