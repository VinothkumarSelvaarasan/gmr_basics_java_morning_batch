package LinkedListPgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class SimpleLinkedList {
	List<String> studentName=new LinkedList<String>();
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
		SimpleLinkedList sll=new SimpleLinkedList();
		sll.addData();
		sll.printData();
	}

}
