package ArrayListAndHash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class TatkalBooking {
	List<HashMap<String,String>> ahm=new ArrayList<HashMap<String,String>>();
	Scanner s=new Scanner(System.in);
	void addData() {
		for(int i=0;i<2;i++)	{
			HashMap<String,String> hm=new HashMap<String,String>();	
			System.out.println("Enter the Starting Place ");
			hm.put("Starting", s.next());
			System.out.println("Enter the Destination Place ");
			hm.put("Destination", s.next());
			System.out.println("Enter the passenger Name ");
			hm.put("passengerName", s.next());
			ahm.add(hm);
		}	}
	void printData() {
		Iterator<HashMap<String,String>> it=ahm.iterator();
		while(it.hasNext()) 	{
			System.out.println(it.next());
		}  }
public static void main(String[] args) {
	TatkalBooking tatBook=new TatkalBooking();
	tatBook.addData();
	tatBook.printData();
}
}
