package SimpleHashMapo;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {
	HashMap<String,String> hm=new HashMap<String,String>();
	void addData()
	{
		hm.put("RegisterNumer", "ITCSE001");	
		hm.put("Name", "Vinothkumar Selvaarasan");
		hm.put("Department", "CSE");
		hm.put("", "Its Null Key Values"); //It accept one null key
		hm.put("emailid", ""); //It accept more than one null values
		hm.put("phonenumber", "");//It accept more than one null values
		
		for(Map.Entry<String, String> mapEntry:hm.entrySet())
		{
			System.out.println(mapEntry.getKey() +" -> "+mapEntry.getValue());
		}
	}
	public static void main(String[] args) {
		SimpleHashMap shm=new SimpleHashMap();
		shm.addData();
	}

}
